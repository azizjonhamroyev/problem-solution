create table prompts
(
    user_id int,
    prompt  varchar,
    tokens  int
);

select user_id,
       count(user_id)        as prompt_count,
       round(avg(tokens), 2) as avg_tokens
from prompts
group by user_id
having count(user_id) > 2
   and count(distinct tokens) <> 1
order by avg_tokens desc, user_id;
