package p342Nj;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p769gj.C14181w;
import p769gj.InterfaceC14147A;

/* JADX INFO: renamed from: Nj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5815i implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18983a;

    /* JADX INFO: renamed from: b */
    public final C4479j f18984b;

    public /* synthetic */ C5815i(C4479j c4479j, int i10) {
        this.f18983a = i10;
        this.f18984b = c4479j;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f18983a) {
            case 0:
                Set viewBindings = (Set) this.f18984b.get();
                AbstractC16544l.m18094g(viewBindings, "viewBindings");
                InterfaceC14147A[] interfaceC14147AArr = (InterfaceC14147A[]) viewBindings.toArray(new InterfaceC14147A[0]);
                InterfaceC14147A[] bindings = (InterfaceC14147A[]) Arrays.copyOf(interfaceC14147AArr, interfaceC14147AArr.length);
                AbstractC16544l.m18094g(bindings, "bindings");
                return new C14181w((InterfaceC14147A[]) Arrays.copyOf(bindings, bindings.length));
            default:
                return new C17238a(this.f18984b);
        }
    }
}
