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

2.在xml文件中定义keyboard</br>

3.在创建Keyboard，并监听KeyboardView

（不想写说明，太麻烦了，具体看代码）

