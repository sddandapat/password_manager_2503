-- create sequence for table
CREATE SEQUENCE automation_sequence
    START WITH 1000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

---- create table for users
CREATE TABLE automation.users {
    user_pk INT DEFAULT next_val('automation_sequence') PRIMARY_KEY,
    user_name varchar(30) NOT NULL,
    password varchar(255) NOT NULL,
    user_email varchar(255) NOT NULL,
    deleted_row TIMESTAMP DEFAULT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
}

---create user group

CREATE TABLE automation.groups
    group_pk INT DEFAULT next_val('automation_sequence') PRIMARY_KEY,
    group_name varchar(30) NOT NULL,
    description TEXT,
    deleted_row TIMESTAMP DEFAULT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
}

CREATE TABLE automation.user_groups
    user_group_pk INT DEFAULT next_val('automation_sequence') PRIMARY_KEY,
    group_fk INT NOT NULL,
    user_fk INT NOT NULL,
    deleted_row TIMESTAMP DEFAULT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (group_fk) references automation.groups(group_pk) ON DELETE CASCADE,
    FOREIGN KEY (user_fk) references automation.users(user_pk) ON DELETE CASCADE
}