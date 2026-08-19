package p927og;

import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p586Y0.C9566r;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: og.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18191b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58008Y;

    /* JADX INFO: renamed from: Z */
    public int f58009Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9566r f58010o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f58011p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18191b(C9566r c9566r, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58010o0 = c9566r;
        this.f58011p0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18191b(this.f58010o0, this.f58011p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18191b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r1 = r7 - 1;
        r3.set(r7, java.lang.Boolean.TRUE);
        r6.f58008Y = r1;
        r6.f58009Z = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (p025An.AbstractC0575H.m1184m(80, r6) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r7 < 0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:6:0x0010). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58009Z;
        C9566r c9566r = this.f58010o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c9566r.clear();
            List list = this.f58011p0;
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c9566r.add(Boolean.FALSE);
            }
            size = list.size() - 1;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f58008Y;
            AbstractC9233X.m9807c(obj);
            size = i12;
        }
        return C17296C.f55119a;
    }
}
