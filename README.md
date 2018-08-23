### 如何通过KeyboardView构建一款自己需要的软键盘？
步骤如下：
1.在布局文件中添加</br>
><android.inputmethodservice.KeyboardView</br>
  >>android:id="@+id/keyboardView"</br>
    android:layout_width="match_parent"</br>
    android:layout_height="wrap_content"</br>
    android:background="#e6e6e6"</br>
    android:focusable="true"</br>
    android:focusableInTouchMode="true"</br>
    android:keyBackground="@android:color/white"</br>
    android:keyTextColor="@color/colorPrimary"</br>
    android:keyTextSize="16sp"</br>
    android:labelTextSize="16sp"</br>
    android:padding="1dp"</br>
    android:shadowRadius="0"</br>
    android:shadowColor="@color/colorPrimary"
    app:layout_constraintBottom_toBottomOf="parent" /></br>

KeyboardView中各属性：
* keyBackground：按键背景
* keyTextColor：按键文字颜色
* keyTextSize：按键文字大小
* labelTextSize：标签文字大小,keylabel有多个字符且keycodes只有一个值时，该属性生效。
* shadowRadius：按键文字阴影半径
* shadowColor：按键文字阴影颜色

2.在xml文件中定义keyboard
><Keyboard xmlns:android="http://schemas.android.com/apk/res/android"</br>
  >>android:horizontalGap="1dp"</br>
    android:keyHeight="40dp"</br>
    android:keyWidth="33.3%p"</br>
    android:verticalGap="1dp"></br>
    <Row></br>
        <Key</br>
            >>>android:codes="1"</br>
            android:keyLabel="1"</br>
            android:keyOutputText="1" /></br>
        <Key</br>
            android:codes="2"</br>
            android:keyLabel="2"</br>
            android:keyOutputText="2" /></br>
        <Key</br>
            android:codes="3"</br>
            android:keyLabel="3"</br>
            android:keyOutputText="3" /></br>
            
    </Row></br>
    <Row></br>
        >>>...</br>
    Row></br>
    ...</br>
></Keyboard></br>
