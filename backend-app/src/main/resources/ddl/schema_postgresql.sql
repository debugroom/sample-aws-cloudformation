-- ユーザ
CREATE TABLE USR
(
	-- ユーザID
	USER_ID bigint NOT NULL,
	-- 名前
	FIRST_NAME varchar,
	-- 苗字
	FAMILY_NAME varchar,
	-- ログインID
	LOGIN_ID varchar UNIQUE,
	-- ログイン中
	IS_LOGIN boolean,
	-- バージョン
	VER int,
	-- 最終更新日時
	LAST_UPDATED_AT timestamp,
	PRIMARY KEY (USER_ID)
) WITHOUT OIDS;
