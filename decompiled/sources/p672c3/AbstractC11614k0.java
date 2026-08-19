package p672c3;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.widget.RemoteViews;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import mm.C17309l;
import p025An.C0644w;
import p523V9.AbstractC8046a4;
import p523V9.AbstractC8102h4;
import p637a3.InterfaceC10497n;
import p776h3.C14387a;
import p776h3.C14388b;
import p776h3.C14389c;
import p776h3.C14398l;
import p776h3.C14404r;
import p884m3.AbstractC17148g;
import p884m3.C17144c;
import p884m3.C17145d;
import p884m3.C17146e;
import p884m3.C17147f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: c3.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11614k0 {

    /* JADX INFO: renamed from: a */
    public static final Object f35156a = AbstractC17659D.m19244f(new C17309l(EnumC11620n0.f35204p0, Integer.valueOf(R.layout.glance_text)), new C17309l(EnumC11620n0.f35205q0, Integer.valueOf(R.layout.glance_list)), new C17309l(EnumC11620n0.f35206r0, Integer.valueOf(R.layout.glance_check_box)), new C17309l(EnumC11620n0.f35207s0, Integer.valueOf(R.layout.glance_check_box_backport)), new C17309l(EnumC11620n0.f35208t0, Integer.valueOf(R.layout.glance_button)), new C17309l(EnumC11620n0.f35188D0, Integer.valueOf(R.layout.glance_swtch)), new C17309l(EnumC11620n0.f35189E0, Integer.valueOf(R.layout.glance_swtch_backport)), new C17309l(EnumC11620n0.f35209u0, Integer.valueOf(R.layout.glance_frame)), new C17309l(EnumC11620n0.f35190F0, Integer.valueOf(R.layout.glance_image_crop)), new C17309l(EnumC11620n0.f35193I0, Integer.valueOf(R.layout.glance_image_crop_decorative)), new C17309l(EnumC11620n0.f35191G0, Integer.valueOf(R.layout.glance_image_fit)), new C17309l(EnumC11620n0.f35194J0, Integer.valueOf(R.layout.glance_image_fit_decorative)), new C17309l(EnumC11620n0.f35192H0, Integer.valueOf(R.layout.glance_image_fill_bounds)), new C17309l(EnumC11620n0.f35195K0, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new C17309l(EnumC11620n0.f35210v0, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new C17309l(EnumC11620n0.f35211w0, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new C17309l(EnumC11620n0.f35212x0, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new C17309l(EnumC11620n0.f35213y0, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new C17309l(EnumC11620n0.f35214z0, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new C17309l(EnumC11620n0.f35185A0, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new C17309l(EnumC11620n0.f35186B0, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new C17309l(EnumC11620n0.f35187C0, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new C17309l(EnumC11620n0.f35196L0, Integer.valueOf(R.layout.glance_radio_button)), new C17309l(EnumC11620n0.f35197M0, Integer.valueOf(R.layout.glance_radio_button_backport)));

    /* JADX INFO: renamed from: b */
    public static final int f35157b;

    /* JADX INFO: renamed from: c */
    public static final int f35158c;

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Map] */
    static {
        int size = AbstractC11574G.f34995f.size();
        f35157b = size;
        f35158c = Build.VERSION.SDK_INT >= 31 ? AbstractC11574G.f34997h : AbstractC11574G.f34997h / size;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final C11626q0 m12983a(C11571E0 c11571e0, InterfaceC10497n interfaceC10497n, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        Context context = c11571e0.f34973a;
        if (i11 >= 31) {
            int i12 = AbstractC11574G.f34997h;
            if (i10 >= i12) {
                throw new IllegalArgumentException(AbstractC17792x.m19534q("Index of the root view cannot be more than ", i12, i10, ", currently ").toString());
            }
            C11565B0 c11565b0 = new C11565B0(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC11574G.f34996g + i10);
            C14404r c14404r = (C14404r) interfaceC10497n.mo10954j(null, C11612j0.f35141p0);
            if (c14404r != null) {
                AbstractC8046a4.m8424c(remoteViews, c14404r, R.id.rootView);
            }
            C14398l c14398l = (C14398l) interfaceC10497n.mo10954j(null, C11612j0.f35142q0);
            if (c14398l != null) {
                AbstractC8046a4.m8423b(remoteViews, c14398l, R.id.rootView);
            }
            if (i11 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new C11626q0(remoteViews, new C11600d0(R.id.rootView, 0, i11 >= 33 ? C17690x.f56481Y : AbstractC17660E.m19258c(new C17309l(0, AbstractC17660E.m19258c(new C17309l(c11565b0, Integer.valueOf(R.id.rootStubId))))), 2));
        }
        int i13 = f35157b * i10;
        int i14 = AbstractC11574G.f34997h;
        if (i13 >= i14) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i14 / 4) + ", currently " + i10).toString());
        }
        C14404r c14404r2 = (C14404r) interfaceC10497n.mo10954j(null, C11612j0.f35139Z);
        AbstractC17148g abstractC17148g = C17147f.f54817a;
        AbstractC17148g abstractC17148g2 = c14404r2 != null ? c14404r2.f45151a : abstractC17148g;
        C14398l c14398l2 = (C14398l) interfaceC10497n.mo10954j(null, C11612j0.f35140o0);
        if (c14398l2 != null) {
            abstractC17148g = c14398l2.f45139a;
        }
        C17146e c17146e = C17146e.f54816a;
        int i15 = abstractC17148g2.equals(c17146e) ? 4 : 1;
        int i16 = abstractC17148g.equals(c17146e) ? 4 : 1;
        C11565B0 c11565b1 = new C11565B0(i15 == 2 ? 1 : i15, i16 != 2 ? i16 : 1);
        Integer num = (Integer) AbstractC11574G.f34995f.get(c11565b1);
        if (num != null) {
            return new C11626q0(new RemoteViews(context.getPackageName(), i13 + AbstractC11574G.f34996g + num.intValue()), new C11600d0(0, 0, AbstractC17660E.m19258c(new C17309l(0, AbstractC17660E.m19258c(new C17309l(c11565b1, Integer.valueOf(R.id.rootStubId))))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + AbstractC10763a.m11042C(i15) + ", " + AbstractC10763a.m11042C(i16) + ']');
    }

    /* JADX INFO: renamed from: b */
    public static final C11600d0 m12984b(RemoteViews remoteViews, C11571E0 c11571e0, EnumC11620n0 enumC11620n0, int i10, InterfaceC10497n interfaceC10497n, C14387a c14387a, C14388b c14388b) {
        int iIntValue;
        if (i10 > 10) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Truncated " + enumC11620n0 + " container from " + i10 + " to 10 elements", new IllegalArgumentException(enumC11620n0 + " container cannot have more than 10 elements"));
        }
        int i11 = i10 <= 10 ? i10 : 10;
        Integer numM12988f = m12988f(enumC11620n0, interfaceC10497n);
        if (numM12988f != null) {
            iIntValue = numM12988f.intValue();
        } else {
            C11637w c11637w = (C11637w) AbstractC11574G.f34990a.get(new C11639x(enumC11620n0, i11, c14387a, c14388b));
            Integer numValueOf = c11637w != null ? Integer.valueOf(c11637w.f35263a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + enumC11620n0 + " with " + i10 + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) AbstractC11574G.f34991b.get(enumC11620n0);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + enumC11620n0);
        }
        C11600d0 c11600d0M12986d = m12986d(remoteViews, c11571e0, iIntValue, interfaceC10497n);
        int i12 = c11600d0M12986d.f35092b;
        int i13 = c11600d0M12986d.f35091a;
        C11600d0 c11600d0 = new C11600d0(i13, i12, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i13);
        }
        return c11600d0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static final C11600d0 m12985c(RemoteViews remoteViews, C11571E0 c11571e0, EnumC11620n0 enumC11620n0, InterfaceC10497n interfaceC10497n) {
        Integer numM12988f = m12988f(enumC11620n0, interfaceC10497n);
        if (numM12988f != null || (numM12988f = (Integer) f35156a.get(enumC11620n0)) != null) {
            return m12986d(remoteViews, c11571e0, numM12988f.intValue(), interfaceC10497n);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + enumC11620n0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final C11600d0 m12986d(RemoteViews remoteViews, C11571E0 c11571e0, int i10, InterfaceC10497n interfaceC10497n) {
        Integer numValueOf;
        C14404r c14404r = (C14404r) interfaceC10497n.mo10954j(null, C11612j0.f35143r0);
        AbstractC17148g abstractC17148g = C17147f.f54817a;
        AbstractC17148g abstractC17148g2 = c14404r != null ? c14404r.f45151a : abstractC17148g;
        C14398l c14398l = (C14398l) interfaceC10497n.mo10954j(null, C11612j0.f35144s0);
        if (c14398l != null) {
            abstractC17148g = c14398l.f45139a;
        }
        if (interfaceC10497n.mo10953c()) {
            numValueOf = null;
        } else {
            if (c11571e0.f34981i.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = c11571e0.f34977e;
        if (i11 >= 33) {
            int iIntValue = numValueOf != null ? numValueOf.intValue() : c11571e0.f34979g.incrementAndGet();
            RemoteViews remoteViewsM12982a = C11610i0.f35122a.m12982a(c11571e0.f34973a.getPackageName(), i10, iIntValue);
            int i13 = c11571e0.f34980h.f35091a;
            if (i11 >= 31) {
                C11630s0.f35246a.m13002a(remoteViews, i13, remoteViewsM12982a, i12);
            } else {
                remoteViews.addView(i13, remoteViewsM12982a);
            }
            return new C11600d0(iIntValue, 0, null, 6);
        }
        if (i11 >= 31) {
            C17145d c17145d = C17145d.f54815a;
            return new C11600d0(AbstractC8102h4.m8578a(remoteViews, c11571e0, m12987e(remoteViews, c11571e0, i12, abstractC17148g2.equals(c17145d) ? 3 : 1, abstractC17148g.equals(c17145d) ? 3 : 1), i10, numValueOf), 0, null, 6);
        }
        int iM12989g = m12989g(abstractC17148g2);
        int iM12989g2 = m12989g(abstractC17148g);
        int iM12987e = m12987e(remoteViews, c11571e0, i12, iM12989g, iM12989g2);
        if (iM12989g != 2 && iM12989g2 != 2) {
            return new C11600d0(AbstractC8102h4.m8578a(remoteViews, c11571e0, iM12987e, i10, numValueOf), 0, null, 6);
        }
        C11608h0 c11608h0 = (C11608h0) AbstractC11574G.f34994e.get(new C11565B0(iM12989g, iM12989g2));
        if (c11608h0 != null) {
            return new C11600d0(AbstractC8102h4.m8578a(remoteViews, c11571e0, R.id.glanceViewStub, i10, numValueOf), AbstractC8102h4.m8578a(remoteViews, c11571e0, iM12987e, c11608h0.f35117a, null), null, 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + AbstractC10763a.m11042C(iM12989g) + ", height=" + AbstractC10763a.m11042C(iM12989g2));
    }

    /* JADX INFO: renamed from: e */
    public static final int m12987e(RemoteViews remoteViews, C11571E0 c11571e0, int i10, int i11, int i12) {
        C11565B0 c11565b0 = new C11565B0(i11 == 2 ? 1 : i11, i12 != 2 ? i12 : 1);
        Map map = (Map) c11571e0.f34980h.f35093c.get(Integer.valueOf(i10));
        if (map == null) {
            throw new IllegalStateException(AbstractC10763a.m11048f(i10, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map.get(c11565b0);
        if (num == null) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "No child for position ", " and size ");
            sbM11057o.append(AbstractC10763a.m11042C(i11));
            sbM11057o.append(" x ");
            sbM11057o.append(AbstractC10763a.m11042C(i12));
            throw new IllegalStateException(sbM11057o.toString());
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC8102h4.m8578a(remoteViews, c11571e0, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: f */
    public static final Integer m12988f(EnumC11620n0 enumC11620n0, InterfaceC10497n interfaceC10497n) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        C11593a c11593a = (C11593a) interfaceC10497n.mo10954j(null, C11612j0.f35145t0);
        C14404r c14404r = (C14404r) interfaceC10497n.mo10954j(null, C11612j0.f35146u0);
        C17145d c17145d = C17145d.f54815a;
        boolean zEquals = c14404r != null ? c14404r.f45151a.equals(c17145d) : false;
        C14398l c14398l = (C14398l) interfaceC10497n.mo10954j(null, C11612j0.f35147v0);
        boolean zEquals2 = c14398l != null ? c14398l.f45139a.equals(c17145d) : false;
        if (c11593a != null) {
            ?? r6 = AbstractC11574G.f34992c;
            C14389c c14389c = c11593a.f35077a;
            C11608h0 c11608h0 = (C11608h0) r6.get(new C11631t(enumC11620n0, c14389c.f45117a, c14389c.f45118b));
            if (c11608h0 != null) {
                return Integer.valueOf(c11608h0.f35117a);
            }
            throw new IllegalArgumentException("Cannot find " + enumC11620n0 + " with alignment " + c14389c);
        }
        if (!zEquals && !zEquals2) {
            return null;
        }
        C11608h0 c11608h1 = (C11608h0) AbstractC11574G.f34993d.get(new C11632t0(enumC11620n0, zEquals, zEquals2));
        if (c11608h1 != null) {
            return Integer.valueOf(c11608h1.f35117a);
        }
        throw new IllegalArgumentException("Cannot find " + enumC11620n0 + " with defaultWeight set");
    }

    /* JADX INFO: renamed from: g */
    public static final int m12989g(AbstractC17148g abstractC17148g) {
        if (abstractC17148g instanceof C17147f) {
            return 1;
        }
        if (abstractC17148g instanceof C17145d) {
            return 3;
        }
        if (abstractC17148g instanceof C17146e) {
            return 4;
        }
        if (abstractC17148g instanceof C17144c) {
            return 2;
        }
        throw new C0644w();
    }
}
