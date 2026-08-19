package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20235r extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64030a;

    public C20235r(ViewModelFactoryProvider viewModelFactoryProvider) {
        this.f64030a = viewModelFactoryProvider;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20235r) && AbstractC16544l.m18089b(this.f64030a, ((C20235r) obj).f64030a);
    }

    public final int hashCode() {
        return this.f64030a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
