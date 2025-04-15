<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/titleTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Unit Converter"
        android:textSize="24sp"
        android:textStyle="bold"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/fromLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="From:"
        android:textSize="16sp"
        android:layout_marginTop="24dp"
        app:layout_constraintTop_toBottomOf="@id/titleTextView"
        app:layout_constraintStart_toStartOf="parent" />

    <Spinner
        android:id="@+id/fromUnitSpinner"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        app:layout_constraintTop_toTopOf="@id/fromLabel"
        app:layout_constraintBottom_toBottomOf="@id/fromLabel"
        app:layout_constraintStart_toEndOf="@id/fromLabel"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/inputEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter value"
        android:inputType="numberDecimal"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/fromUnitSpinner"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/toLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="To:"
        android:textSize="16sp"
        android:layout_marginTop="24dp"
        app:layout_constraintTop_toBottomOf="@id/inputEditText"
        app:layout_constraintStart_toStartOf="parent" />

    <Spinner
        android:id="@+id/toUnitSpinner"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        app:layout_constraintTop_toTopOf="@id/toLabel"
        app:layout_constraintBottom_toBottomOf="@id/toLabel"
        app:layout_constraintStart_toEndOf="@id/toLabel"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/resultLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Result:"
        android:textSize="18sp"
        android:textStyle="bold"
        android:layout_marginTop="24dp"
        app:layout_constraintTop_toBottomOf="@id/toUnitSpinner"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="0"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="end"
        android:layout_marginStart="8dp"
        app:layout_constraintTop_toTopOf="@id/resultLabel"
        app:layout_constraintBottom_toBottomOf="@id/resultLabel"
        app:layout_constraintStart_toEndOf="@id/resultLabel"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
