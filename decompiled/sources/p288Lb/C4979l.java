package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.C3674q;
import p335Nb.AbstractC5704c;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4979l {

    /* JADX INFO: renamed from: a */
    public final String f16225a;

    /* JADX INFO: renamed from: b */
    public final Field f16226b;

    /* JADX INFO: renamed from: c */
    public final String f16227c;

    /* JADX INFO: renamed from: d */
    public final boolean f16228d;

    /* JADX INFO: renamed from: e */
    public final boolean f16229e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f16230f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Method f16231g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f16232h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC3656B f16233i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3669l f16234j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TypeToken f16235k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f16236l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f16237m;

    public C4979l(String str, Field field, boolean z6, boolean z10, boolean z11, Method method, boolean z12, AbstractC3656B abstractC3656B, C3669l c3669l, TypeToken typeToken, boolean z13, boolean z14) {
        this.f16230f = z11;
        this.f16231g = method;
        this.f16232h = z12;
        this.f16233i = abstractC3656B;
        this.f16234j = c3669l;
        this.f16235k = typeToken;
        this.f16236l = z13;
        this.f16237m = z14;
        this.f16225a = str;
        this.f16226b = field;
        this.f16227c = field.getName();
        this.f16228d = z6;
        this.f16229e = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m5636a(C6382c c6382c, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f16228d) {
            Field field = this.f16226b;
            boolean z6 = this.f16230f;
            Method method = this.f16231g;
            if (z6) {
                if (method == null) {
                    C4983p.m5640b(obj, field);
                } else {
                    C4983p.m5640b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new C3674q(AbstractC10763a.m11054l("Accessor ", AbstractC5704c.m6150d(method, false), " threw exception"), e10.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c6382c.m7013S(this.f16225a);
            boolean z10 = this.f16232h;
            AbstractC3656B c4987t = this.f16233i;
            if (!z10) {
                c4987t = new C4987t(this.f16234j, c4987t, this.f16235k.getType());
            }
            c4987t.mo4359b(c6382c, objInvoke);
        }
    }
}
