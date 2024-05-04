package ch06.ex07.case02;

public sealed class Pet permits Dog, Bird{

}
// 봉인된 클래스에 경우에는 permits 범위 내에 있는 자식 클래스에게만 상속 가능하다.