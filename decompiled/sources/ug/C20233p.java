package ug;

import com.openai.viewmodel.ViewModelFactoryProvider;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C20233p extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final ViewModelFactoryProvider f64028a;

    public C20233p(ViewModelFactoryProvider component) {
        AbstractC16544l.m18094g(component, "component");
        this.f64028a = component;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20233p) && AbstractC16544l.m18089b(this.f64028a, ((C20233p) obj).f64028a);
    }

    public final int hashCode() {
        return this.f64028a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
