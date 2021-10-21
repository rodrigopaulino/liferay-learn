# ワークフロー統計情報：レポート

グローバルメニュー（![Applications Menu](../../../images/icon-applications-menu.png)）からワークフロー統計情報を開くと（[コントロールパネル] → [ワークフロー] → [メトリクス]）、システムにインストールされている各ワークフローのメトリクスがすぐに表示されます。

![このビューでは、保留中の項目を含むプロセスは自動車保険の申請のみです。](./workflow-metrics-reports/images/06.png)

インストールされているすべてのワークフロープロセスのテーブルビューには、期限切れの項目の数、予定通りの項目の数、ワークフロープロセスで保留中の項目の数が表示されます。

ワークフロープロセスの1つをクリックして、より詳細なレポートにアクセスします。

レポートUIには、タブで表される*[ダッシュボード]* と*[Performance]* という2つのメインビューがあります。

[ダッシュボード]ビューはデフォルトで表示されます。 SLAによって追跡されていない項目も含め、現在ワークフロープロセスにある項目が含まれます。 追跡されていない項目には、SLA自体より前の項目、または処理中であるがSLAがトリガーされるステップに達していない項目が含まれます。

[Performance]ビューには、ワークフローでの処理が完了した項目のメトリクスが表示されます。

``` note::
   ** Elasticsearchが必要です：**ワークフロー統計情報を使用するには、Elasticsearchを使用してLiferay DXPデータにインデックスを付ける必要があります。 Elasticsearch のインストールについては、`こちら <../../../using-search/installing-and-upgrading-a-search-engine/introduction-to-installing-a-search-engine.md>`_ を参照してください。
```

## ダッシュボードについて

ダッシュボードには、保留中のアイテムに関する3つの貴重なレポートが表示されます。保留中の項目の概要、ステップごとの作業量テーブル、および担当者ごとの作業量テーブルの3つです。

![[ダッシュボード]タブには、処理中の保留中の項目が表示されます。](./workflow-metrics-reports/images/11.png)

**保留中の項目:** 保留中の項目には、SLAステータスごとに項目の概要が表示されます。 保留中の項目に列挙されている特定の項目を表示するには、ステータスのいずれかをクリックしてドリルダウンします。

**ステップごとの作業量:** ステップごとの作業量には、ワークフロープロセスの各ステップにある項目の内訳が、SLAステータス（期限切れまたは予定通り）ごとに表示されます。

**担当者ごとの作業量:** 担当者ごとの作業量の表には、ワークフロープロセスの担当者の内訳が、キュー内の項目数の降順で表示されます。 この表では、負担がかかり過ぎている担当者を一目で把握できる貴重な情報が提供されます。 *[すべての担当者を見る]* リンクをクリックして、[[すべての項目]](#viewing-all-workflow-items)ビューを表示します。このビューには、より優れたフィルタリングおよび検索機能を備えた、より堅牢なテーブルがあります。 たとえば、ワークフローのステップごとにフィルタリングすることで、負担の多い担当者と負担の軽い担当者を識別することができます。 いくつかのタスクを再割り当てすることで、ボトルネックを解消することができます。

## プロセスパフォーマンスを理解する

*[Performance]* タブには、ワークフロープロセスを完了した項目のメトリクスが表示されます。 期間は、データ表示ごとに設定できます（デフォルトは30日）。

**完了した項目:** すべての完了した項目のSLAステータスの概要メトリクスが表示されます。 追跡されていない項目もここに含まれます。

![完了した項目をSLAステータス別に表示します。](./workflow-metrics-reports/images/02.png)

**完了速度:** 折れ線グラフには、ワークフロープロセスの完了率が表示されます。 デフォルトの表示には、過去30日間の1日あたりの完了したワークフローインスタンスの数が表示されます。

期間の全体的なスループット率がグラフの上部に表示され（*Inst/timeUnit*）、傾向線がグラフの本体に表示されます。 新しい期間を選択すると、全体的なパフォーマンスメトリクスとグラフの本体が更新されます。時間単位は、測定している合計期間によって変化します。 過去30日間以上の期間の場合、時間単位は設定可能です（1日、1週間、1か月あたりのインスタンス）。

![ワークフロープロセスの項目の完了率を表示します。](./workflow-metrics-reports/images/03.png)

**ステップごとのパフォーマンス:** 各ステップで発生したSLA違反の数と、ステップの平均完了時間が表示されます。 ステップが少なくとも1つのSLA定義の一部である場合は、そのステップでSLAに違反した項目の数と、プロセスのこのステップで発生した違反の合計の割合（パーセンテージ）を、このワークフローステップを通過したすべての項目と比較して確認できます。

![各ワークフローステップのパフォーマンスを表示します。](./workflow-metrics-reports/images/04.png)

すべてのステップパフォーマンスメトリクスの完全なビューを表示するには、*[すべてのステップを見る]* をクリックします。

**担当者ごとのパフォーマンス:** 各ワークフロー担当者の平均完了時間と完了したタスクの合計が表示されます。 ワークフローステップごとにこのメトリクスを絞り込むと、担当者のボトルネックがどこにあるかを詳細に把握できます。

![時間の経過に伴うワークフロープロセスの項目の完了率を表示します。](./workflow-metrics-reports/images/05.png)

ワークフローの担当者の全体像を表示するには、*[すべての担当者を見る]* をクリックします。

## 時間ごとのメトリクスの絞り込み

今日、昨日、過去7日間、過去30日間、90日間、180日間、または昨年のイベントなど、時間によるフィルタリングが可能です。 期間を変更すると、メトリクスが変更され（たとえば、1時間あたりのインスタンス数、1週間あたりのインスタンス数など）、データの適切なビューが提供されます。

## すべてのワークフロー項目の表示

ワークフロー内のすべての項目のテーブルビューがあり、詳細な問い合わせに対応するための便利なフィルターが用意されています。 アクセスするには、[ダッシュボード]タブまたは[Performance]タブから、目的のSLAステータスにカーソルを合わせます。 それをクリックして、概要レポートから[すべての項目]画面に入ると、次の列を含むより詳細なテーブルが表示されます。

**ID**: これはシステムに対するワークフロー項目の数値識別子です。 これをクリックすると、項目の詳細ビューに入ることができます。

**項目の件名**: 管理者が項目を識別するのに役立つ、人間が読める形式の項目の要約。

**処理ステップ**: 項目がワークフローのどこにあるかを識別します。

**Created By**: 送信したユーザーのユーザー名を表示します。

**Creation Date**: 項目がワークフローに送信された日時を表示します。

[すべての項目]ビューをフィルタリングして、分析する項目のサブセットを見つけることができます。

### SLAステータスによる絞り込み

期限が過ぎているか、予定通りか、追跡されていないかに基づいて項目を絞り込みます。

![SLAステータス（期限切れ、予定通り、または未追跡）で絞り込みます。](./workflow-metrics-reports/images/10.png)

**期限切れ**: 期限切れの項目は、少なくとも1つのSLAで定義された期限に違反しています。

**予定通り**: 予定通りの項目は *いずれの*SLA期限にも違反していません。

**未追跡**: 未追跡の項目がワークフロープロセスにありますが、現在SLAの管理下にはありません。 ワークフロープロセスの中にあっても、SLAの開始とされるステップに到達していない場合や、SLAの定義よりも前の段階にある場合もあります。

### プロセスステータスと完了期間による絞り込み

ワークフロープロセスで保留中か完了済みかによって項目を絞り込みます。

完了ステータスでフィルタリングした場合、完了期間で項目をフィルタリングするという追加のフィルタリングオプションがあります。

![プロセスのステータスと完了期間で絞り込みます。](./workflow-metrics-reports/images/09.png)

### 処理ステップによる絞り込み

ワークフロー定義のどこにあるかに基づいて、項目を絞り込むことができます。 たとえば、唯一の承認者のワークフロープロセスでは、レビュータスクのすべての項目を含むレポートを表示するように選択できます。 これは、ワークフロー定義ごとに異なります。

### フィルターの組み合わせ

フィルターを組み合わせて、表示したい項目だけを探すことができます。 たとえば、以下は、唯一の承認者プロセスのレビュータスクで、予定通りか期限切れかに関係なく、ステータスが「完了」または「保留中」のすべての項目です。 追跡されていない項目は表示されません。

![フィルターを組み合わせることで、必要な項目だけを表示することができます。](./workflow-metrics-reports/images/08.png)

## 項目の詳細

単一のワークフロープロセス項目のメトリクスを表示するには、[すべての項目]ビューで[ID]フィールドをクリックします。 ポップアップに、項目の詳細情報が表示されます。

![項目の詳細には、SLAステータス情報と、項目が解決済みかオープンかが含まれます。](./workflow-metrics-reports/images/07.png)

ここから、アセットに関する詳細情報を表示でき、*[申請ページに移動]* をクリックすると、コントロールパネルの[送信数]セクションにある項目のビューにリダイレクトされます。

項目詳細ビューの上部は重要です。 SLA内の項目の期日とそのSLA完了ステータス（*[Open]* または *[解決済み]*）に関する情報が表示されます。

**Open**: 定義されたSLA目標はまだ達成されていません。 未処理の項目のステータスは、[期限切れ]または[予定通り]のいずれかです。

**解決済み**: 定義されたSLA目標が完了しました。 解決済みの項目のステータスは、[期限切れ]または[予定通り]のいずれかです。

## ワークフロー統計情報のインデックスの再構築

Liferay DXPの *インデックス再構築*アクションは、マッピングファイルに基づいた検索インデックスを完全に削除し、その後再作成します。 メトリクスもデータベースに保存されるため、インデックスを再構築するときにデータが失われる危険はありません。 ワークフロー統計情報のインデックスを再構築するには、

1.  メトリクスアプリケーションから、オプションメニュー（![Options](../../../images/icon-options.png)）を開き、*[Settings]* をクリックします。

2.  次に、[ワークフローのインデックス操作]画面で、[ワークフローのインデックス]エントリの*[すべてインデックスを再構築]* をクリックします。

    このオプションは、ワークフロー統計情報アプリケーションのすべてのインデックスに作用します。 より詳細なオプションも利用できます。

[検索エンジン](../../../using-search/installing-and-upgrading-a-search-engine/installing-a-search-engine.md)を最初に設定する際およびアップグレードするたびに、ワークフロー統計情報のインデックス再構築が必要です。 経験則として、Liferay DXPのメインの検索インデックスが再構築されるたびに、ワークフロー統計情報のインデックス再構築が必要です。

ワークフロープロセスの全体的なメトリクスから、ワークフロー内の単一項目の詳細まで、新しいワークフロー統計情報機能を使用して、Liferay DXPでの*作業にかかる時間*を把握できます。

## 追加情報

  - [Using Workflow Metrics](./using-workflow-metrics.md)
  - [Building Workflows](../designing-and-managing-workflows/building-workflows.md)