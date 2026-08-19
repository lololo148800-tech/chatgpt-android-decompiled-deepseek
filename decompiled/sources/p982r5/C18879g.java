package p982r5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import mm.C17296C;
import p007A5.AbstractC0371f;
import p007A5.ComponentCallbacks2C0378m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1033u5.C20116a;
import p1033u5.C20118c;
import p1075w5.C20831i;
import p1075w5.C20835m;
import p1075w5.C20838p;
import p473T7.AbstractC7262c;
import p571X9.AbstractC9233X;
import p604Yk.C10077b;
import p864l5.C16816c;
import p864l5.C16826m;
import p899n5.EnumC17488e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: r5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18879g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60168Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18880h f60169Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20831i f60170o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f60171p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C20835m f60172q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16816c f60173r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C20116a f60174s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C18882j f60175t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18879g(C18880h c18880h, C20831i c20831i, Object obj, C20835m c20835m, C16816c c16816c, C20116a c20116a, C18882j c18882j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60169Z = c18880h;
        this.f60170o0 = c20831i;
        this.f60171p0 = obj;
        this.f60172q0 = c20835m;
        this.f60173r0 = c16816c;
        this.f60174s0 = c20116a;
        this.f60175t0 = c18882j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18879g(this.f60169Z, this.f60170o0, this.f60171p0, this.f60172q0, this.f60173r0, this.f60174s0, this.f60175t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18879g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C20118c c20118c;
        Bitmap bitmap;
        boolean z6;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60168Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18880h c18880h = this.f60169Z;
            C20831i c20831i = this.f60170o0;
            Object obj2 = this.f60171p0;
            C20835m c20835m = this.f60172q0;
            C16816c c16816c = this.f60173r0;
            this.f60168Y = 1;
            obj = C18880h.m20197b(c18880h, c20831i, obj2, c20835m, c16816c, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C18873a c18873a = (C18873a) obj;
        ComponentCallbacks2C0378m componentCallbacks2C0378m = this.f60169Z.f60177b;
        synchronized (componentCallbacks2C0378m) {
            try {
                C16826m c16826m = (C16826m) componentCallbacks2C0378m.f1281Y.get();
                if (c16826m == null) {
                    componentCallbacks2C0378m.m1018b();
                } else if (componentCallbacks2C0378m.f1282Z == null) {
                    Context context = c16826m.f53988a;
                    componentCallbacks2C0378m.f1282Z = context;
                    context.registerComponentCallbacks(componentCallbacks2C0378m);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C10077b c10077b = this.f60169Z.f60179d;
        C20116a c20116a = this.f60174s0;
        if (!this.f60170o0.f66225p.f66160Z || (c20118c = (C20118c) ((C16826m) c10077b.f29833Z).f53990c.getValue()) == null || c20116a == null) {
            z6 = false;
        } else {
            Drawable drawable = c18873a.f60119a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z6 = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c18873a.f60120b));
                String str = c18873a.f60122d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                c20118c.f63742a.mo14959e(new C20116a(c20116a.f63738Y, AbstractC7262c.m7720i(c20116a.f63739Z)), bitmap, AbstractC7262c.m7720i(linkedHashMap));
                z6 = true;
            }
        }
        Drawable drawable2 = c18873a.f60119a;
        C20831i c20831i2 = this.f60170o0;
        EnumC17488e enumC17488e = c18873a.f60121c;
        C20116a c20116a2 = z6 ? this.f60174s0 : null;
        String str2 = c18873a.f60122d;
        boolean z10 = c18873a.f60120b;
        C18882j c18882j = this.f60175t0;
        Bitmap.Config config = AbstractC0371f.f1262a;
        return new C20838p(drawable2, c20831i2, enumC17488e, c20116a2, str2, z10, (c18882j instanceof C18882j) && c18882j.f60191g);
    }
}
