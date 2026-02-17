create table reactions
(
    user_id    int,
    content_id int,
    reaction   varchar
);

with t as (select user_id, count(reaction) as reaction_count
           from reactions
           group by user_id
           having count(distinct content_id) >= 5),


     k as (select r.user_id,
                  count(r.reaction) as reaction_count,
                  reaction
           from reactions r
           group by r.user_id, r.reaction)
select k.user_id                                              as user_id,
       k.reaction                                             as dominant_reaction,
       round(k.reaction_count::numeric / t.reaction_count, 2) as reaction_ratio
from k
         left join t on k.user_id = t.user_id
where k.reaction_count::numeric / t.reaction_count >= 0.6
order by reaction_ratio desc, k.user_id;


