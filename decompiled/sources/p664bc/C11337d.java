package p664bc;

import ac.C10539a;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p1060v9.AbstractC20502t;
import p139F9.BinderC2679b;
import p228J.AbstractC3794B0;
import p401Qb.C6584a;
import p658b5.C11238i;
import p746fa.InterfaceC13595d;
import p813ij.C15026j;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: bc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11337d implements InterfaceC13595d, InterfaceC17207d {

    /* JADX INFO: renamed from: Y */
    public static final C11337d f34274Y = new C11337d();

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C11337d f34275Z = new C11337d();

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C11337d f34276o0 = new C11337d();

    /* JADX INFO: renamed from: a */
    public static BinderC2679b m12776a(C10539a c10539a) {
        int i10 = c10539a.f31260g;
        if (i10 == -1) {
            Bitmap bitmap = c10539a.f31254a;
            AbstractC20502t.m21157h(bitmap);
            return new BinderC2679b(bitmap);
        }
        if (i10 != 17) {
            if (i10 == 35) {
                return new BinderC2679b(c10539a.f31256c == null ? null : (Image) c10539a.f31256c.f61960Z);
            }
            if (i10 != 842094169) {
                throw new C6584a(AbstractC10763a.m11048f(c10539a.f31260g, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = c10539a.f31255b;
        AbstractC20502t.m21157h(byteBuffer);
        return new BinderC2679b(byteBuffer);
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        Set setM12537E0 = c11238i.m12537E0(AbstractC11336c.class);
        C11337d c11337d = new C11337d();
        new HashMap();
        new HashMap();
        Iterator it = setM12537E0.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        return c11337d;
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        C15026j c15026j = AbstractC11335b.f34269q0;
        if (Log.isLoggable((String) c15026j.f46724Y, 6)) {
            String str = (String) c15026j.f46725Z;
            AbstractC15256t.m16466d("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
