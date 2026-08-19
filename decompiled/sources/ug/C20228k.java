package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20228k extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64022a;

    public C20228k(ViewModelFactoryProvider viewModelFactoryProvider) {
        this.f64022a = viewModelFactoryProvider;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20228k) && AbstractC16544l.m18089b(this.f64022a, ((C20228k) obj).f64022a);
    }

    public final int hashCode() {
        return this.f64022a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
