## About
[WEB+DB PRESS Vol.113](https://www.amazon.co.jp/WEB-DB-PRESS-Vol-113-PRESS%E7%B7%A8%E9%9B%86%E9%83%A8-ebook/dp/B07ZCPPHK2/ref=tmm_kin_swatch_0?_encoding=UTF8&tag=maftracking156404-22&qid=1570143543&sr=1-1) 掲載  
「体験 ドメイン駆動設計 モデリングから実装までを一気に制覇」の3〜4章におけるサンプルコードです。  
なお、解説用のコードのため、アプリケーション起動やテスト実行はできませんのでご了承ください。

リファクタリング過程の解説や実装対象のドメインモデルは本誌に掲載されているのでそちらをご参照ください。  
また、本誌の見出しなど紹介は[こちらのブログ記事](https://little-hands.hatenablog.com/entry/2019/10/24/web-db-press-ddd)をご参照ください。

## アーキテクチャ
本サンプルでは、本誌の紹介のとおり、オニオンアーキテクチャを採用しています。

![](image/architecture.png)
(WEB+DB PRESS Vol.113より)

アプリケーション層、ドメイン層、インフラストラクチャ層のコードが含まれており、プレゼンテーション層については省略しています。

## パッケージ構造

[org.littlahands.dddsample.dddsample](https://github.com/little-hands/webdbpress-2019-10-ddd/tree/master/src/main/java/org/littlahands/dddsample/dddsample) 以下のパッケージ `v1` 〜 `v4` に、本文中のバージョン1から4までのコードが一通り入っています。v1から順に見ればリファクタリングの様子が追えるようになっています。

## 参考記事
DDDで使用するアーキテクチャついては、以下ブログ記事に詳細な説明がありますので、よろしければご参照ください。

* [ドメイン駆動設計で実装を始めるのに一番とっつきやすいアーキテクチャは何か](https://little-hands.hatenablog.com/entry/2017/10/04/231743)
* [新卒にも伝わるドメイン駆動設計のアーキテクチャ説明](https://little-hands.hatenablog.com/entry/2018/12/10/ddd-architecture)
* [ドメイン駆動 + オニオンアーキテクチャ概略](https://little-hands.hatenablog.com/entry/2017/10/11/075634)

## 著者
* 松岡 幸一郎
  * ブログ: https://little-hands.hatenablog.com/
  * Twitter: [@little_hand_s](https://twitter.com/little_hand_s)
* 成瀬 允宣
  * ブログ: https://nrslib.com/
  * Twitter: [@nrslib](https://twitter.com/nrslib)


## ご質問、問い合わせなど
記事内容やDDDに関するご質問、お問い合わせは[質問箱](https://peing.net/ja/little_hands)で受け付けています。匿名で質問できるので、お気軽にご質問ください。回答は[@little_hand_s](https://twitter.com/little_hand_s)のアカウントでツイートします。

また、個別で実装パターン勉強会・ドメインモデリングハンズオンなど開催しております。  
詳細はこちらのページに記載しておりますので、ご興味ある方はこちらの記事ご参照いただき、お問い合わせください。
https://little-hands.hatenablog.com/entry/2019/10/05/seminars


### お願い
Twitterハッシュタグ[#体験DDD](https://twitter.com/search?q=%23%E4%BD%93%E9%A8%93DDD&src=typed_query&f=live)で感想を呟いていただけると非常に励みになります。よろしくお願いします。笑

