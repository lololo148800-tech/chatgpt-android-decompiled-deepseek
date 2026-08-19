package p030B2;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.C21025f;
import p1091wn.InterfaceC21029j;
import p1112xm.C21306j;
import p1113xn.C21315i;

/* JADX INFO: renamed from: B2.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0740V implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2103a;

    /* JADX INFO: renamed from: b */
    public final Object f2104b;

    public /* synthetic */ C0740V(Object obj, int i10) {
        this.f2103a = i10;
        this.f2104b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Iterator] */
    /* JADX INFO: renamed from: c */
    private final Iterator m1588c() {
        return this.f2104b;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        switch (this.f2103a) {
            case 0:
                return new C0742X((ViewGroup) this.f2104b, 0);
            case 1:
                return m1588c();
            case 2:
                return AbstractC16544l.m18098k((Object[]) this.f2104b);
            case 3:
                return ((Iterable) this.f2104b).iterator();
            case 4:
                return new C21025f(this);
            case 5:
                return (Iterator) this.f2104b;
            case 6:
                return new C21306j(this);
            default:
                return new C21315i((String) this.f2104b);
        }
    }
}
