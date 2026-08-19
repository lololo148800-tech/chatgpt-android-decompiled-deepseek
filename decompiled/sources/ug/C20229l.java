package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20229l extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64023a;

    public C20229l(ViewModelFactoryProvider viewModelFactoryProvider) {
        this.f64023a = viewModelFactoryProvider;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64023a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20229l) && AbstractC16544l.m18089b(this.f64023a, ((C20229l) obj).f64023a);
    }

    public final int hashCode() {
        return this.f64023a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
