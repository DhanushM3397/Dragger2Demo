package com.demo.dagger2demo_kotlin.databinding;
import com.demo.dagger2demo_kotlin.R;
import com.demo.dagger2demo_kotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 1);
        sViewsWithIds.put(R.id.button, 2);
        sViewsWithIds.put(R.id.button2, 3);
        sViewsWithIds.put(R.id.recyclerView, 4);
        sViewsWithIds.put(R.id.feedrecyclerView1, 5);
        sViewsWithIds.put(R.id.floatingActionButton, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myViewModel == variableId) {
            setMyViewModel((com.demo.dagger2demo_kotlin.SubscriberViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyViewModel(@Nullable com.demo.dagger2demo_kotlin.SubscriberViewModel MyViewModel) {
        this.mMyViewModel = MyViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMyViewModel((com.demo.dagger2demo_kotlin.SubscriberViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMyViewModel(com.demo.dagger2demo_kotlin.SubscriberViewModel MyViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}