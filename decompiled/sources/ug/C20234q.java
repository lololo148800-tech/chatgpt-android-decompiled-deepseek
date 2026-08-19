package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20234q extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64029a;

    public C20234q(ViewModelFactoryProvider viewModelFactoryProvider) {
        this.f64029a = viewModelFactoryProvider;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20234q) && AbstractC16544l.m18089b(this.f64029a, ((C20234q) obj).f64029a);
    }

    public final int hashCode() {
        return this.f64029a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
