package androidx.navigation;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;

/* JADX INFO: renamed from: androidx.navigation.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11120a extends AbstractSavedStateViewModelFactory {
    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    /* JADX INFO: renamed from: e */
    public final ViewModel mo12114e(String str, Class cls, C11082S c11082s) {
        return new NavBackStackEntry$SavedStateViewModel(c11082s);
    }
}
