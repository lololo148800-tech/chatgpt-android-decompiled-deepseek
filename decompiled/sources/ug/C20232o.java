package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20232o extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64027a;

    public C20232o(ViewModelFactoryProvider component) {
        AbstractC16544l.m18094g(component, "component");
        this.f64027a = component;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20232o) && AbstractC16544l.m18089b(this.f64027a, ((C20232o) obj).f64027a);
    }

    public final int hashCode() {
        return this.f64027a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
