package p001A;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import bb.AbstractC11278C;
import bb.C11299Y;
import com.auth0.android.request.internal.C11844c;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11846e;
import com.openai.chatgpt.R;
import fo.C13711h;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17349p;
import mo.C17356w;
import mo.InterfaceC17337d;
import p005A3.C0324k;
import p005A3.C0329p;
import p005A3.InterfaceC0327n;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p033B5.C0821e;
import p057C3.C1526D;
import p057C3.C1547Z;
import p1006s6.C19457g;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1027tp.C20044I;
import p1027tp.C20050O;
import p1027tp.C20058b;
import p1027tp.C20065i;
import p1027tp.C20070n;
import p1027tp.C20078v;
import p103Dn.C2127D0;
import p1057v6.C20461a;
import p1057v6.C20463c;
import p1057v6.C20464d;
import p1073w3.AbstractC20817s;
import p1076w6.C20843a;
import p1099x6.C21144l;
import p1099x6.C21145m;
import p1099x6.C21146n;
import p1139z0.C21585H;
import p178H.C3162o0;
import p178H.C3175v;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p214Ib.AbstractC3656B;
import p221Ii.RunnableC3724c;
import p228J.AbstractC3812N;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.C3865u0;
import p232J3.C4253y;
import p301M.AbstractC5229k;
import p301M.RunnableC5228j;
import p379Pb.C6381b;
import p437Rn.C6949g;
import p446S6.C7023b;
import p446S6.C7024c;
import p497U6.InterfaceC7569a;
import p499U9.AbstractC7589s;
import p523V9.AbstractC7861C4;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p523V9.AbstractC8047a5;
import p541W6.C8436f;
import p541W6.InterfaceC8434d;
import p541W6.InterfaceC8435e;
import p544W9.AbstractC8577W2;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9233X;
import p712dp.C13187c;
import p729ej.C13414e;
import p747fb.InterfaceFutureC13608b;
import p784hb.C14438g;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p913o2.AbstractC17803d;
import p917o6.C17867t;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17873z;
import p972qm.InterfaceC18770c;
import p979r2.AbstractC18861b;
import p996rm.EnumC19250a;
import p999s.AbstractC19311O0;
import p999s.C19301J0;
import p999s.C19372q;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0017I0 implements InterfaceC8435e {

    /* JADX INFO: renamed from: Y */
    public Object f64Y;

    /* JADX INFO: renamed from: Z */
    public Object f65Z;

    /* JADX INFO: renamed from: o0 */
    public Object f66o0;

    /* JADX INFO: renamed from: p0 */
    public Object f67p0;

    /* JADX INFO: renamed from: q0 */
    public Object f68q0;

    /* JADX INFO: renamed from: r0 */
    public Object f69r0;

    public C0017I0(int i10) {
        switch (i10) {
            case 8:
                C20044I c20044i = C20044I.f63473c;
                this.f67p0 = new ArrayList();
                this.f68q0 = new ArrayList();
                this.f64Y = c20044i;
                break;
            default:
                this.f64Y = new int[]{2131230842, 2131230840, 2131230766};
                this.f65Z = new int[]{2131230790, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f66o0 = new int[]{2131230839, 2131230841, 2131230783, R.drawable.abc_text_cursor_material, 2131230836, 2131230837, 2131230838};
                this.f67p0 = new int[]{2131230815, R.drawable.abc_cab_background_internal_bg, 2131230814};
                this.f68q0 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f69r0 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m55C(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C19372q.f61352b;
        }
        drawableMutate.setColorFilter(C19372q.m20474c(i10, mode));
    }

    /* JADX INFO: renamed from: a */
    public static C0329p m56a(DataInputStream dataInputStream) {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException(AbstractC10763a.m11048f(i12, "Invalid value size: "));
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = AbstractC20817s.f66111f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new C0329p(map);
    }

    /* JADX INFO: renamed from: b */
    public static void m57b(C0329p c0329p, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = c0329p.f1146b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m58g(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static ColorStateList m59k(Context context, int i10) {
        int iM20396c = AbstractC19311O0.m20396c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC19311O0.f61183b, AbstractC19311O0.f61185d, AbstractC19311O0.f61184c, AbstractC19311O0.f61187f}, new int[]{AbstractC19311O0.m20395b(context, R.attr.colorButtonNormal), AbstractC18861b.m20167e(iM20396c, i10), AbstractC18861b.m20167e(iM20396c, i10), i10});
    }

    /* JADX INFO: renamed from: n */
    public static C4253y m60n(AbstractC3812N abstractC3812N, AbstractC11278C abstractC11278C, C4253y c4253y, C19762L c19762l) {
        int iMo2413b;
        C1526D c1526d = (C1526D) abstractC3812N;
        AbstractC19764N abstractC19764NM2239Y = c1526d.m2239Y();
        c1526d.m2256q0();
        if (c1526d.f4087k1.f4250a.m20728p()) {
            iMo2413b = 0;
        } else {
            C1547Z c1547z = c1526d.f4087k1;
            iMo2413b = c1547z.f4250a.mo2413b(c1547z.f4251b.f13895a);
        }
        Object objMo2419l = abstractC19764NM2239Y.m20728p() ? null : abstractC19764NM2239Y.mo2419l(iMo2413b);
        int iM20715b = (c1526d.m2243d0() || abstractC19764NM2239Y.m20728p()) ? -1 : abstractC19764NM2239Y.mo2410f(iMo2413b, c19762l, false).m20715b(AbstractC20817s.m21390D(c1526d.m2237W()) - c19762l.f62581e);
        for (int i10 = 0; i10 < abstractC11278C.size(); i10++) {
            C4253y c4253y2 = (C4253y) abstractC11278C.get(i10);
            if (m62w(c4253y2, objMo2419l, c1526d.m2243d0(), c1526d.m2234T(), c1526d.m2235U(), iM20715b)) {
                return c4253y2;
            }
        }
        if (abstractC11278C.isEmpty() && c4253y != null) {
            if (m62w(c4253y, objMo2419l, c1526d.m2243d0(), c1526d.m2234T(), c1526d.m2235U(), iM20715b)) {
                return c4253y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static LayerDrawable m61s(C19301J0 c19301j0, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableM20384f = c19301j0.m20384f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM20384f2 = c19301j0.m20384f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM20384f instanceof BitmapDrawable) && drawableM20384f.getIntrinsicWidth() == dimensionPixelSize && drawableM20384f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM20384f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM20384f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM20384f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM20384f2 instanceof BitmapDrawable) && drawableM20384f2.getIntrinsicWidth() == dimensionPixelSize && drawableM20384f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM20384f2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM20384f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM20384f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m62w(C4253y c4253y, Object obj, boolean z6, int i10, int i11, int i12) {
        if (!c4253y.f13895a.equals(obj)) {
            return false;
        }
        int i13 = c4253y.f13896b;
        return (z6 && i13 == i10 && c4253y.f13897c == i11) || (!z6 && i13 == -1 && c4253y.f13899e == i12);
    }

    /* JADX INFO: renamed from: A */
    public InterfaceC17841I m63A(InterfaceC17842J interfaceC17842J, C17867t c17867t, C20461a cacheHeaders) {
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        C14438g c14438gM9710c = AbstractC9160K3.m9710c(interfaceC17842J, c17867t);
        C21144l c21144l = new C21144l(interfaceC17842J, this, cacheHeaders, c14438gM9710c, 0);
        C13414e c13414e = (C13414e) this.f69r0;
        c13414e.getClass();
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) c13414e.f42490Y).readLock();
        lock.lock();
        try {
            Object objInvoke = c21144l.invoke();
            lock.unlock();
            C20843a c20843a = (C20843a) objInvoke;
            C0095w0 c0095w0Mo19589b = interfaceC17842J.mo19589b();
            C17689w c17689w = C17689w.f56480Y;
            Object objM21442a = c20843a.m21442a(c20843a.f66275a.get(c17689w), c17689w);
            AbstractC16544l.m18092e(objM21442a, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            C19457g c19457g = new C19457g((Map) objM21442a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c17867t.f56964d);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : ((Map) c14438gM9710c.f45414Y).entrySet()) {
                if (AbstractC16544l.m18089b(entry.getValue(), Boolean.FALSE)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            return (InterfaceC17841I) ((InterfaceC17873z) c0095w0Mo19589b.mo373j(c19457g, new C17867t(linkedHashMap, linkedHashMap2.keySet(), c17867t.f56962b, null)));
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public Object m64B(UUID mutationId, AbstractC19687c abstractC19687c) {
        C21145m c21145m;
        if (abstractC19687c instanceof C21145m) {
            c21145m = (C21145m) abstractC19687c;
            int i10 = c21145m.f67198o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21145m.f67198o0 = i10 - Integer.MIN_VALUE;
            } else {
                c21145m = new C21145m(this, abstractC19687c);
            }
        } else {
            c21145m = new C21145m(this, abstractC19687c);
        }
        Object obj = c21145m.f67196Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21145m.f67198o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return null;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC16544l.m18094g(mutationId, "mutationId");
        return (Set) ((C13414e) this.f69r0).m14958L(new C0821e(this, 7, mutationId));
    }

    /* JADX INFO: renamed from: D */
    public void m65D(InterfaceC7569a interfaceC7569a) {
        ((Executor) ((C11846e) ((C11845d) this.f68q0).f35976a).f35977Y).execute(new RunnableC3724c(this, 28, interfaceC7569a));
    }

    /* JADX INFO: renamed from: E */
    public void m66E() {
        ((InterfaceC0327n) this.f68q0).mo944j((HashMap) this.f64Y);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f66o0;
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((SparseArray) this.f65Z).remove(sparseBooleanArray.keyAt(i10));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f67p0).clear();
    }

    /* JADX INFO: renamed from: F */
    public void m67F(AbstractC19764N abstractC19764N) {
        C0420b c0420b = new C0420b(4);
        if (((AbstractC11278C) this.f65Z).isEmpty()) {
            m72f(c0420b, (C4253y) this.f68q0, abstractC19764N);
            if (!AbstractC7589s.m7931f((C4253y) this.f69r0, (C4253y) this.f68q0)) {
                m72f(c0420b, (C4253y) this.f69r0, abstractC19764N);
            }
            if (!AbstractC7589s.m7931f((C4253y) this.f67p0, (C4253y) this.f68q0) && !AbstractC7589s.m7931f((C4253y) this.f67p0, (C4253y) this.f69r0)) {
                m72f(c0420b, (C4253y) this.f67p0, abstractC19764N);
            }
        } else {
            for (int i10 = 0; i10 < ((AbstractC11278C) this.f65Z).size(); i10++) {
                m72f(c0420b, (C4253y) ((AbstractC11278C) this.f65Z).get(i10), abstractC19764N);
            }
            if (!((AbstractC11278C) this.f65Z).contains((C4253y) this.f67p0)) {
                m72f(c0420b, (C4253y) this.f67p0, abstractC19764N);
            }
        }
        this.f66o0 = c0420b.m1052g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public Object m68G(InterfaceC17842J operation, InterfaceC17841I operationData, C17867t customScalarAdapters, C20461a cacheHeaders, AbstractC19687c abstractC19687c) {
        C21146n c21146n;
        if (abstractC19687c instanceof C21146n) {
            c21146n = (C21146n) abstractC19687c;
            int i10 = c21146n.f67201o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21146n.f67201o0 = i10 - Integer.MIN_VALUE;
            } else {
                c21146n = new C21146n(this, abstractC19687c);
            }
        } else {
            c21146n = new C21146n(this, abstractC19687c);
        }
        Object obj = c21146n.f67199Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21146n.f67201o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return null;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC16544l.m18094g(operation, "operation");
        AbstractC16544l.m18094g(operationData, "operationData");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        return (Set) ((C13414e) this.f69r0).m14958L(new C20464d(this, AbstractC8047a5.m8436i(operation, operationData, customScalarAdapters, (C20463c) this.f64Y).values(), cacheHeaders));
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC8435e m69c(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        ((LinkedHashMap) ((C13711h) this.f69r0).f43261p0).put(name, value);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC8435e m70d(String str, String value) {
        AbstractC16544l.m18094g(value, "value");
        if (str.equals("scope")) {
            value = AbstractC7861C4.m8135c(value);
        }
        AbstractC16544l.m18094g(value, "value");
        ((LinkedHashMap) ((C13711h) this.f69r0).f43260o0).put(str, value);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC8435e m71e(Map parameters) {
        AbstractC16544l.m18094g(parameters, "parameters");
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(parameters);
        if (parameters.containsKey("scope")) {
            linkedHashMapM19256r.put("scope", AbstractC7861C4.m8135c((String) AbstractC17659D.m19243e(parameters, "scope")));
        }
        ((LinkedHashMap) ((C13711h) this.f69r0).f43260o0).putAll(linkedHashMapM19256r);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m72f(C0420b c0420b, C4253y c4253y, AbstractC19764N abstractC19764N) {
        if (c4253y == null) {
            return;
        }
        if (abstractC19764N.mo2413b(c4253y.f13895a) != -1) {
            c0420b.m1038A(c4253y, abstractC19764N);
            return;
        }
        AbstractC19764N abstractC19764N2 = (AbstractC19764N) ((C11299Y) this.f66o0).get(c4253y);
        if (abstractC19764N2 != null) {
            c0420b.m1038A(c4253y, abstractC19764N2);
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m73h(InterfaceC18770c interfaceC18770c) {
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C11844c(new C6949g(this, 28), null), interfaceC18770c);
    }

    /* JADX INFO: renamed from: i */
    public void m74i(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        C13187c c13187c = new C13187c(1);
        c13187c.m14844f(null, str);
        C17349p c17349pM14841c = c13187c.m14841c();
        ArrayList arrayList = c17349pM14841c.f55291f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.f66o0 = c17349pM14841c;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c17349pM14841c);
        }
    }

    /* JADX INFO: renamed from: j */
    public C20050O m75j() {
        if (((C17349p) this.f66o0) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        InterfaceC17337d c17356w = (InterfaceC17337d) this.f65Z;
        if (c17356w == null) {
            c17356w = new C17356w();
        }
        InterfaceC17337d interfaceC17337d = c17356w;
        Executor executorMo20859a = (Executor) this.f69r0;
        C20044I c20044i = (C20044I) this.f64Y;
        if (executorMo20859a == null) {
            executorMo20859a = c20044i.mo20859a();
        }
        Executor executor = executorMo20859a;
        ArrayList arrayList = new ArrayList((ArrayList) this.f68q0);
        c20044i.getClass();
        C20070n c20070n = new C20070n(executor);
        boolean z6 = c20044i.f63474a;
        arrayList.addAll(z6 ? Arrays.asList(C20065i.f63555a, c20070n) : Collections.singletonList(c20070n));
        ArrayList arrayList2 = (ArrayList) this.f67p0;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z6 ? 1 : 0));
        C20058b c20058b = new C20058b();
        c20058b.f63553a = true;
        arrayList3.add(c20058b);
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(z6 ? Collections.singletonList(C20078v.f63587a) : Collections.emptyList());
        return new C20050O(interfaceC17337d, (C17349p) this.f66o0, DesugarCollections.unmodifiableList(arrayList3), DesugarCollections.unmodifiableList(arrayList), executor);
    }

    /* JADX INFO: renamed from: l */
    public C3865u0 m76l() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f67p0;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C3857q0 c3857q0M4583d = C3857q0.m4583d((C0015H0) this.f66o0, size);
        c3857q0M4583d.f11656b.f283a = 1;
        C3162o0 c3162o0 = new C3162o0(surface);
        this.f64Y = c3162o0;
        InterfaceFutureC13608b interfaceFutureC13608bM5780d = AbstractC5229k.m5780d(c3162o0.f11530e);
        C21585H c21585h = new C21585H(surface, 1, surfaceTexture);
        interfaceFutureC13608bM5780d.mo5766a(new RunnableC5228j(interfaceFutureC13608bM5780d, 0, c21585h), AbstractC8577W2.m9240b());
        c3857q0M4583d.m4585b((C3162o0) this.f64Y, C3175v.f9575d, -1);
        C3859r0 c3859r0 = (C3859r0) this.f69r0;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        C3859r0 c3859r1 = new C3859r0(new C0011F0(this, 0));
        this.f69r0 = c3859r1;
        c3857q0M4583d.f11660f = c3859r1;
        return c3857q0M4583d.m4586c();
    }

    /* JADX INFO: renamed from: m */
    public Object m77m() {
        C7024c c7024c = (C7024c) this.f67p0;
        try {
            C8436f c8436fMo9037a = ((InterfaceC8434d) this.f65Z).mo9037a((String) this.f64Y, (C13711h) this.f69r0);
            InputStreamReader inputStreamReader = new InputStreamReader(c8436fMo9037a.f26259b, StandardCharsets.UTF_8);
            int i10 = c8436fMo9037a.f26258a;
            try {
                if (200 <= i10 && i10 < 300) {
                    try {
                        AbstractC3656B abstractC3656B = (AbstractC3656B) ((C11845d) this.f66o0).f35976a;
                        abstractC3656B.getClass();
                        Object objMo4358a = abstractC3656B.mo4358a(new C6381b(inputStreamReader));
                        AbstractC7942M5.m8232a(inputStreamReader, null);
                        return objMo4358a;
                    } catch (Exception e10) {
                        throw C7024c.m7420a(e10);
                    }
                }
                try {
                    if (c8436fMo9037a.m9038a()) {
                        throw c7024c.m7421b(i10, inputStreamReader);
                    }
                    String strM8249b = AbstractC7958O5.m8249b(inputStreamReader);
                    C7023b c7023b = new C7023b();
                    c7023b.f22454Y = "a0.sdk.internal_error.plain";
                    c7023b.f22455Z = strM8249b;
                    c7023b.f22456o0 = i10;
                    throw c7023b;
                } catch (Exception e11) {
                    throw C7024c.m7420a(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(inputStreamReader, th2);
                throw th3;
            }
        } catch (IOException e12) {
            throw C7024c.m7420a(e12);
        }
    }

    /* JADX INFO: renamed from: o */
    public C0324k m78o(String str) {
        return (C0324k) ((HashMap) this.f64Y).get(str);
    }

    /* JADX INFO: renamed from: p */
    public ArrayList m79p() {
        ArrayList arrayList;
        synchronized (this.f65Z) {
            arrayList = new ArrayList((LinkedHashSet) this.f66o0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public ArrayList m80q() {
        ArrayList arrayList;
        synchronized (this.f65Z) {
            arrayList = new ArrayList((LinkedHashSet) this.f68q0);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public C0324k m81r(String str) {
        HashMap map = (HashMap) this.f64Y;
        C0324k c0324k = (C0324k) map.get(str);
        if (c0324k != null) {
            return c0324k;
        }
        SparseArray sparseArray = (SparseArray) this.f65Z;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        C0324k c0324k2 = new C0324k(iKeyAt, str, C0329p.f1144c);
        map.put(str, c0324k2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f67p0).put(iKeyAt, true);
        ((InterfaceC0327n) this.f68q0).mo941f(c0324k2);
        return c0324k2;
    }

    /* JADX INFO: renamed from: t */
    public ArrayList m82t() {
        ArrayList arrayList;
        synchronized (this.f65Z) {
            arrayList = new ArrayList();
            arrayList.addAll(m79p());
            arrayList.addAll(m80q());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public ColorStateList m83u(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return AbstractC17803d.m19556c(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230832) {
            return AbstractC17803d.m19556c(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return m59k(context, AbstractC19311O0.m20396c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return m59k(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return m59k(context, AbstractC19311O0.m20396c(context, R.attr.colorAccent));
            }
            if (i10 == 2131230827 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC17803d.m19556c(context, R.color.abc_tint_spinner);
            }
            if (m58g((int[]) this.f65Z, i10)) {
                return AbstractC19311O0.m20397d(context, R.attr.colorControlNormal);
            }
            if (m58g((int[]) this.f68q0, i10)) {
                return AbstractC17803d.m19556c(context, R.color.abc_tint_default);
            }
            if (m58g((int[]) this.f69r0, i10)) {
                return AbstractC17803d.m19556c(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC17803d.m19556c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM20397d = AbstractC19311O0.m20397d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM20397d == null || !colorStateListM20397d.isStateful()) {
            iArr[0] = AbstractC19311O0.f61183b;
            iArr2[0] = AbstractC19311O0.m20395b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC19311O0.f61186e;
            iArr2[1] = AbstractC19311O0.m20396c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC19311O0.f61187f;
            iArr2[2] = AbstractC19311O0.m20396c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC19311O0.f61183b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM20397d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC19311O0.f61186e;
            iArr2[1] = AbstractC19311O0.m20396c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC19311O0.f61187f;
            iArr2[2] = colorStateListM20397d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public void m84v(long j10) {
        InterfaceC0327n interfaceC0327n;
        InterfaceC0327n interfaceC0327n2 = (InterfaceC0327n) this.f68q0;
        interfaceC0327n2.mo945k(j10);
        InterfaceC0327n interfaceC0327n3 = (InterfaceC0327n) this.f69r0;
        if (interfaceC0327n3 != null) {
            interfaceC0327n3.mo945k(j10);
        }
        boolean zMo943i = interfaceC0327n2.mo943i();
        SparseArray sparseArray = (SparseArray) this.f65Z;
        HashMap map = (HashMap) this.f64Y;
        if (zMo943i || (interfaceC0327n = (InterfaceC0327n) this.f69r0) == null || !interfaceC0327n.mo943i()) {
            interfaceC0327n2.mo946l(map, sparseArray);
        } else {
            ((InterfaceC0327n) this.f69r0).mo946l(map, sparseArray);
            interfaceC0327n2.mo942g(map);
        }
        InterfaceC0327n interfaceC0327n4 = (InterfaceC0327n) this.f69r0;
        if (interfaceC0327n4 != null) {
            interfaceC0327n4.delete();
            this.f69r0 = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m85x(String str) {
        HashMap map = (HashMap) this.f64Y;
        C0324k c0324k = (C0324k) map.get(str);
        if (c0324k != null && c0324k.f1131c.isEmpty() && c0324k.f1132d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f67p0;
            int i10 = c0324k.f1129a;
            boolean z6 = sparseBooleanArray.get(i10);
            ((InterfaceC0327n) this.f68q0).mo940d(c0324k, z6);
            SparseArray sparseArray = (SparseArray) this.f65Z;
            if (z6) {
                sparseArray.remove(i10);
                sparseBooleanArray.delete(i10);
            } else {
                sparseArray.put(i10, null);
                ((SparseBooleanArray) this.f66o0).put(i10, true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m86y(C0033Q0 c0033q0) {
        synchronized (this.f65Z) {
            ((LinkedHashSet) this.f68q0).add(c0033q0);
        }
    }

    /* JADX INFO: renamed from: z */
    public Object m87z(Set set, AbstractC19687c abstractC19687c) {
        Object objMo395a;
        boolean zIsEmpty = set.isEmpty();
        C17296C c17296c = C17296C.f55119a;
        return (!zIsEmpty && (objMo395a = ((C2127D0) this.f66o0).mo395a(set, abstractC19687c)) == EnumC19250a.f61036Y) ? objMo395a : c17296c;
    }
}
