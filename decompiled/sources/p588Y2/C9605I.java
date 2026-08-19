package p588Y2;

import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.util.ArrayList;

/* JADX INFO: renamed from: Y2.I */
/* JADX INFO: loaded from: classes.dex */
public final class C9605I implements InterfaceC9604H {

    /* JADX INFO: renamed from: a */
    public final int f28903a;

    /* JADX INFO: renamed from: b */
    public final int f28904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC11002c f28905c;

    public C9605I(AbstractC11002c abstractC11002c, int i10, int i11) {
        this.f28905c = abstractC11002c;
        this.f28903a = i10;
        this.f28904b = i11;
    }

    @Override // p588Y2.InterfaceC9604H
    /* JADX INFO: renamed from: a */
    public final boolean mo10148a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC11002c abstractC11002c = this.f28905c;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = abstractC11002c.f33207x;
        int i10 = this.f28903a;
        if (abstractComponentCallbacksC11000a == null || i10 >= 0 || !abstractComponentCallbacksC11000a.m11751n().m11777N(-1, 0)) {
            return abstractC11002c.m11778O(arrayList, arrayList2, i10, this.f28904b);
        }
        return false;
    }
}
