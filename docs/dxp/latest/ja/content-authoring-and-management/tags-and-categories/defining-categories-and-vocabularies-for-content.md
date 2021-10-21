# コンテンツのカテゴリとボキャブラリの定義

カテゴリを使用すると、類似したアセットをグループ化し、コンテンツを整理できます。 [タグ](./tagging-content-and-managing-tags.md)と同様、カテゴリは検索やナビゲーションで関連する情報を見つけるのに役立ちます。 Liferay DXPのカテゴリについての詳細とさまざまな使用シナリオについては、 [カテゴリとタグを使用したコンテンツの整理](organizing-content-with-categories-and-tags.md)を参照してください。

[ボキャブラリ](#defining-vocabularies)を使用してカテゴリをグループ化し、[サブカテゴリ](#creating-subcategories)を使用してカテゴリの階層を作成します。 他のサイトのグローバルサイトでボキャブラリとカテゴリを使用できますが、グローバルサイトで作成または編集できるのはグローバルボキャブラリのみです。

``` note::
   カテゴリパネルでカテゴリとボキャブラリを管理できるのは、サイト管理者だけです。
```

## ボキャブラリの定義

1.  ボキャブラリを作成したいサイトに移動します。

2.  プロダクトメニューを開き、サイトメニューの下で、*[カテゴリ設定]* → *[カテゴリ]* に移動します。

3.  *新規ボキャブラリ*（![New Vocabulary](../../images/icon-plus.png)）をクリックします。

4.  ボキャブラリの*名前*と、必要に応じて*説明*を入力します。

5.  残りのカテゴリのオプションを完了します。

    **複数カテゴリの許可:** このオプションを有効にすると、ボキャブラリの複数のカテゴリを使用してアセットを分類できます。 無効にすると、ボキャブラリから1つのカテゴリしか使用できません。

    **Visibility:**  詳細は、[ボキャブラリの可視性](./organizing-content-with-categories-and-tags.md#vocabulary-visibility)を参照してください。

    ``` important::
       ボキャブラリを保存した後、[Visibility]を変更することはできません。
    ```

    **関連するアセットタイプ:** このボキャブラリからカテゴリを適用するために許可されるアセットタイプを選択します。 このタイプのアセットに常にカテゴリを設定する場合は、*[Required]* を*[Yes]* に設定します。

    ``` tip::
      [関連するアセットタイプ]セクションの下にある追加ボタンをクリックすると、複数のアセットタイプを含めることができます。
    ```

    ![複数のアセットタイプのカテゴリオプションを定義します。](./defining-categories-and-vocabularies-for-content/images/02.png)

6.  *[保存]* をクリックします。

7.  既存のボキャブラリを編集するには、ボキャブラリ名の横にある*アクション*（![Actions](../../images/icon-actions.png)）メニューをクリックし、*[編集する]* を選択します。

    ![アクションメニューを使用して、既存のボキャブラリを編集します。](./defining-categories-and-vocabularies-for-content/images/08.gif)

## カテゴリの定義

カテゴリは、サイトメニュー→ *[カテゴリ設定]* → *[カテゴリ]* パネルで作成および管理します。 各ボキャブラリの[Select]ボタンを使用して、コンテンツエディターの[カテゴリ設定]セクションから新しいカテゴリを作成することもできます。

``` important::
   1つのボキャブラリに最大150のカテゴリを作成できます。
```

![コンテンツエディタの[カテゴリ設定]セクションから新しいカテゴリを追加します。](./defining-categories-and-vocabularies-for-content/images/04.png)

### カテゴリ作成

1.  プロダクトメニューを開き、サイトメニューの下で、*[カテゴリ設定]* → *[カテゴリ]* に移動します。
2.  *[ボキャブラリ]* リストの下で、ボキャブラリをクリックして新規カテゴリを追加します。
3.  *[カテゴリーを追加]*（![Add Category](../../images/icon-add.png)）をクリックします。
4.  カテゴリの*名前*と、必要に応じて*説明*を入力します。
5.  *[保存]* をクリックするか、さらにカテゴリを追加するには*[保存して新規追加]* をクリックします。
6.  既存のカテゴリを編集するには、カテゴリ名の横にある*アクション*（![Actions](../../images/icon-actions.png)）メニューをクリックします。

### サブカテゴリの作成

カテゴリとサブカテゴリのネストされた階層を作成できます。

1.  プロダクトメニューを開き、サイトメニューの下で、*[カテゴリ設定]* → *[カテゴリ]* に移動します。
2.  *[ボキャブラリ]* リストの下で、変更するボキャブラリをクリックします。
3.  新しいサブカテゴリを作成するカテゴリ名をクリックします。
4.  *[新規サブカテゴリの追加]* 画面で、サブカテゴリの*名前*を入力し、オプションで*説明*を入力します。
5.  *[保存]* をクリックするか、さらにサブカテゴリを追加するには*[保存して新規追加]* をクリックします。

### カテゴリの移動

カテゴリを別のボキャブラリに移動したり、同じボキャブラリのサブカテゴリとして移動したりできます。

1.  プロダクトメニューを開き、サイトメニューの下で、*[カテゴリ設定]* → *[カテゴリ]* に移動します。

2.  移動するカテゴリの横にある*アクション*メニュー（![Actions](../../images/icon-actions.png)）をクリックし、*[移動]* を選択します。

    ![カテゴリを整理するには、[移動]オプションを使用します。](./defining-categories-and-vocabularies-for-content/images/03.png)

3.  カテゴリを移動する*ボキャブラリ*と*カテゴリ*を選択します。

    ``` note::
       カテゴリは、同じ `Visibility タイプ <./organizing-content-with-categories-and-tags.md#vocabulary-visibility>`_ のボキャブラリにのみ移動できます 。 
    ```

### 追加のカテゴリプロパティの編集

カテゴリを作成した後、次の追加オプションを定義できます。

  - 詳細（名前と説明）
  - 画像
  - フレンドリURL
  - プロパティ（キーと値のペア）

これらのオプションにアクセスするには、変更するカテゴリの横にある*アクション*（![Actions](../../images/icon-actions.png)）メニューをクリックし、*[編集する]* を選択します。

![カテゴリを編集して、追加のオプションを定義します。](./defining-categories-and-vocabularies-for-content/images/10.png)

## 関連情報

  - [カテゴリとタグを使用したコンテンツの整理](./organizing-content-with-categories-and-tags.md)
  - [コンテンツのタグ付けとタグの管理](./tagging-content-and-managing-tags.md)
  - [Content Dashboard](../content-dashboard/about-the-content-dashboard.md)