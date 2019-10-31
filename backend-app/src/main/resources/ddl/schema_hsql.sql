-- ユーザ
CREATE TABLE USR
(
	-- ユーザID
	USER_ID bigint NOT NULL,
	-- 名前
	FIRST_NAME varchar(512),
	-- 苗字
	FAMILY_NAME varchar(512),
	-- ログインID
	LOGIN_ID varchar(32) UNIQUE,
	-- ログイン中
	IS_LOGIN boolean,
	-- バージョン
	VER int,
	-- 最終更新日時
	LAST_UPDATED_AT timestamp with time zone,
	PRIMARY KEY (USER_ID)
);
