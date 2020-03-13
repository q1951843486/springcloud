var $ = go.GraphObject.make;
var myDiagram =
    $(go.Diagram, "myDiagramDiv");

var $ = go.GraphObject.make;
var myDiagram =
    $(go.Diagram, "myDiagramDiv",
        {
            initialContentAlignment: go.Spot.Center, // 居中显示Diagram内容
            "undoManager.isEnabled": true // 打开Ctrl-Z撤销和Ctrl-Y重做功能
        });

var myModel = $(go.Model);
// 在model的数据中, 每个节点数据的值都是由一个JS对象来表示:
myModel.nodeDataArray = [
    { key: "Alpha" },
    { key: "Beta" },
    { key: "Gamma" }
];
myDiagram.model = myModel;