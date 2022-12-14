package com.demo.dagger2demo_kotlin.databinding;
import com.demo.dagger2demo_kotlin.R;
import com.demo.dagger2demo_kotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMain2BindingImpl extends ActivityMain2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textview, 1);
        sViewsWithIds.put(R.id.userName1, 2);
        sViewsWithIds.put(R.id.userEmail1, 3);
        sViewsWithIds.put(R.id.simpleCheckBox, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMain2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMain2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
        if (BR.myalertviewmodel == variableId) {
            setMyalertviewmodel((com.demo.dagger2demo_kotlin.SubscriberViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyalertviewmodel(@Nullable com.demo.dagger2demo_kotlin.SubscriberViewModel Myalertviewmodel) {
        this.mMyalertviewmodel = Myalertviewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMyalertviewmodel((com.demo.dagger2demo_kotlin.SubscriberViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMyalertviewmodel(com.demo.dagger2demo_kotlin.SubscriberViewModel Myalertviewmodel, int fieldId) {
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
        flag 0 (0x1L): myalertviewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}