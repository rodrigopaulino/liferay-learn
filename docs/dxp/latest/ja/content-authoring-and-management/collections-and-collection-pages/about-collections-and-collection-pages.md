# コレクションとコレクションページについて

``` note::
   この情報はLiferay DXP 7.3以降に適用されます。 以前のLiferay DXPのバージョンについては、`Liferay DXP 7.2 <#liferay-dxp-7-2>`_を参照してください。
```

コレクションは、情報をグループ化および絞り込みするために使用できるコンテンツ項目のセットです。 次の例を考えてみましょう。 あなたは、製品のWebページに、お客様のサクセスストーリーを紹介するセクションを新設することを計画しています。 このセクションでは、新しいサクセスストーリーが公開されると自動的に表示されるようにしたいと考えています。 この場合、コレクションのコンテンツを表示するコレクションページを使用して、すべてのサクセスストーリーをグループ化するコレクションを作成できます。 コレクションページに加えて、コレクション表示フラグメントを使用して、このコレクションを他のコンテンツページに表示できます（詳細は、[コンテンツページの構築](../../site-building/creating-pages/building-and-managing-content-pages/building-content-pages.md)を参照してください）。

Liferayには2種類のコレクションがあります。

  - **手動コレクション**

    コレクションの一部である項目を手動で選択して管理します。 手動コレクションの項目は自動的に変更されません。

    例えば、 *プロモーション*という名前の手動コレクションを作成し、インターネットWebサイトにいくつかのプロモーション用のWebコンテンツを含めるとします。 コレクション内の項目を選択した後、コレクションを最新の状態に保つために、新しいプロモーションコンテンツを手動で追加する必要があります。

  - **動的コレクション**

    コレクション内の項目のタイプを、これらの項目の基準とともに定義します。 コレクションの項目は、定義した基準に基づいて変更できます。 動的コレクションは、基準に一致する新規項目でコンテンツを最新の状態にしたい場合に役立ちます。

    例えば、キッチン用品ストアの場合、*磁器*タグが付いたすべてのブログ投稿を含むコレクションを作成します（このタグは基準を表しています）。 動的コレクションには、*磁器*タグの付いたすべての新しいブログ投稿が自動的に含まれます。

手動コレクションまたは動的コレクションの作成方法については、 [コレクションの作成](./creating-collections.md)を参照してください。

## コレクションの表示

コレクションの表示には、[コレクションページ](../../site-building/displaying-content/displaying-collections.md#displaying-collections-on-a-collection-page)や[コレクション表示フラグメント](../../site-building/displaying-content/displaying-collections.md#adding-a-collection-display-fragment-to-a-page)を使用することができます。

コレクションページは、コレクションにリンクされているページの一種です。 コレクションページは、コレクションの表示とカスタマイズの作業を容易にします。 たとえば、コレクションページを使用して、コレクションに新しい項目をすばやく追加できます。

![コレクションページを使用してコレクションを表示できます](./about-collections-and-collection-pages/images/01.png)

コレクション表示フラグメントは、コレクションを表示するフラグメントの一種です。 このフラグメントを使用して、コンテントページ、ページのテンプレート、または表示ページにコレクションを表示できます。

![コレクション表示フラグメントを使用して、コレクションのコンテンツを表示できます。](./about-collections-and-collection-pages/images/02.png)

詳細は、[コレクションの表示](../../site-building/displaying-content/displaying-collections.md)を参照してください。

## コレクションのカスタマイズ

Liferayセグメントをコレクションに関連付けて、[セグメント設定](../../site-building/personalizing-site-experience/segmentation/creating-and-managing-user-segments.md)に基づいてさまざまなコレクション項目を表示できます。

次の例を考えてみましょう。 あなたは、登録ユーザーに限定プロモーションを提供することで、キッチン用品ストアでの売り上げを伸ばしたいと考えています。 登録ユーザー向けのプロモーションや商品に関するニュースを含むコレクションを作成します。 商品に関するニュースはすべての人に表示したいが、プロモーションは登録ユーザーのみに限定したいと考えています。 登録ユーザー用の新しいセグメントを作成し、そのセグメントを、プロモーションコンテンツをフィルタリングする新しい*個人用バリエーション*にリンクすることができます。

詳細は、[コレクションのパーソナライズ](../../site-building/personalizing-site-experience/experience-personalization/personalizing-collections.md)を参照してください。

## アセットパブリッシャー設定をコレクションに変換する

コレクションを直接作成することに加えて、[アセットパブリッシャーウィジェット](../../site-building/displaying-content/using-the-asset-publisher-widget/displaying-assets-intro.md)からコレクションを作成できます。 このオプションは、他のページでコレクションとして使用するアセットパブリッシャーのカスタマイゼーションがある場合に役立ちます。 詳細は、[コレクションの作成](./creating-collections.md#creating-a-collection-from-an-asset-publisher)をご覧してください。

## Liferay DXP 7.2

### コンテンツセットの管理

コンテンツセットとは、その名の通り、コンテンツ項目の集合体です。 つまり、管理者はコンテンツの一覧を定義して、その一覧を表示することができます。 コンテンツセットの表示方法は、コンテンツセットの表示に使用される方式によって決まります。 たとえば、コンテンツセットがスマートウォッチアプリで使用されている場合、コンテンツセットはタイトルの単純な一覧として表示され、タイトルを選択すると、接続されたモバイルデバイスに記事全体が表示されます。 同じコンテンツセットを、各記事のすべてのコンテンツとともにWebブラウザに表示できます。

``` note::
    以前のバージョンのLiferay DXPでは、アセットパブリッシャーを使用して、タグ、カテゴリ、アセットタイプなどの基準に基づいて、アセットの静的リストまたは動的リストのいずれかを定義および表示していました。 Liferay DXPコンテンツセットでは、さまざまなタイプのアセットリストを定義するという基本的な考え方を取り入れて拡張しています。 コンテンツリストは、特定のアプリケーションまたはウィジェットのコンテキスト外で作成され、さまざまなチャンネルやアプリケーションで使用および再利用できます。
```

### コンテンツセットの作成と表示

コンテンツセットは、サイト管理インターフェイスを介して作成されます。 コンテンツセットを作成および管理するためのすべての機能がここに含まれています。 コンテンツセットは、Liferayのウィジェットまたは独自のカスタムアプリケーションを使用して表示されます。 詳細は、[コンテンツセットの作成](./creating-collections.md#creating-content-sets)および[コンテンツセットの表示](../../site-building/displaying-content/displaying-collections.md#displaying-content-sets)を参照してください。

### コンテンツセットのパーソナライゼーション

コンテンツセットには、Liferay DXPのパーソナライゼーションエンジンによって駆動されるバリエーションを含めることができます。 コンテンツセットを作成した後、少なくとも1つのユーザーセグメントを作成している場合は、そのセグメントのコンテンツセットのパーソナライズされたエクスペリエンスを作成できます。 コンテンツセットのエクスペリエンスのパーソナライゼーションの力を活用する方法については、[コンテンツセットのパーソナライゼーション](../../site-building/personalizing-site-experience/experience-personalization/personalizing-collections.md#content-set-personalization)を参照してください。

### アセットパブリッシャー設定をコンテンツセットに変換する

あなたはすでにアセットパブリッシャーを使用して、完全で精選されたコンテンツの一覧を作成するためにすでに多くの作業を行ってきたかもしれませんが、今度は作業を複製せずにその一覧を他の場所に表示したいと考えています。 コンテンツセットでそれを行うことができます。 詳細は、[Converting Asset Publisher Configuration to Content Sets guide](./creating-collections.md#converting-asset-publisher-configurations-to-content-sets)を参照してください。

## 関連情報

  - [コレクションの作成](./creating-collections.md)
  - [コレクションの表示](../../site-building/displaying-content/displaying-collections.md)
  - [コレクションのパーソナライズ](../../site-building/personalizing-site-experience/experience-personalization/personalizing-collections.md)