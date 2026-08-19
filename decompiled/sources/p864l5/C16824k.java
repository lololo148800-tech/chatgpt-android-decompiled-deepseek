package p864l5;

import android.graphics.Bitmap;
import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1075w5.C20831i;
import p1098x5.C21129h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p982r5.C18882j;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16824k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f53981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20831i f53982Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16826m f53983o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21129h f53984p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16816c f53985q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Bitmap f53986r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16824k(C20831i c20831i, C16826m c16826m, C21129h c21129h, C16816c c16816c, Bitmap bitmap, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53982Z = c20831i;
        this.f53983o0 = c16826m;
        this.f53984p0 = c21129h;
        this.f53985q0 = c16816c;
        this.f53986r0 = bitmap;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16824k(this.f53982Z, this.f53983o0, this.f53984p0, this.f53985q0, this.f53986r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16824k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53981Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ArrayList arrayList = this.f53983o0.f53996i;
            boolean z6 = this.f53986r0 != null;
            C20831i c20831i = this.f53982Z;
            C18882j c18882j = new C18882j(c20831i, arrayList, 0, c20831i, this.f53984p0, this.f53985q0, z6);
            this.f53981Y = 1;
            obj = c18882j.m20201b(c20831i, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
