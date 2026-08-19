package io.sentry.clientreport;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.sentry.util.C15498c;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import no.AbstractC17708b;
import p001A.C0095w0;
import p008A6.C0383c;
import p008A6.C0384d;
import p008A6.C0385e;
import p008A6.C0386f;
import p008A6.C0387g;
import p008A6.C0388h;
import p008A6.C0389i;
import p013Ab.C0420b;
import p030B2.AbstractC0738T;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p030B2.InterfaceC0783t;
import p1057v6.C20468h;
import p178H.C3179x;
import p523V9.AbstractC8167p5;
import p561X.C8990d;
import p593Y8.C9683j;
import p817j$.util.Objects;
import p862l2.C16806e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p929oi.AbstractC18201b;
import p950po.C18529c;
import p950po.C18530d;
import p951pp.C18531a;
import p974qo.C18795k;
import p975qp.InterfaceC18797a;
import p999s.InterfaceC19362l;

/* JADX INFO: renamed from: io.sentry.clientreport.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15333a implements InterfaceC0783t, InterfaceC18797a, InterfaceC19362l {

    /* JADX INFO: renamed from: Y */
    public final Object f47885Y;

    public /* synthetic */ C15333a(Object obj) {
        this.f47885Y = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m16550a(int i10, boolean z6) {
        C0095w0 c0095w0 = (C0095w0) this.f47885Y;
        if (z6) {
            c0095w0.m366c(i10);
        } else {
            c0095w0.getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m16551b(String str) {
        return AbstractC18201b.f58034a.m12903b(str, (KSerializer) this.f47885Y);
    }

    /* JADX INFO: renamed from: c */
    public void m16552c(String key) {
        AbstractC16544l.m18094g(key, "key");
        C0388h c0388h = (C0388h) this.f47885Y;
        ((C9683j) c0388h.f11539Z).m10277e(1791947362, "DELETE FROM records WHERE key=?", new C0385e(key, 0));
        c0388h.m4519J(1791947362, new C0383c(1));
    }

    @Override // p975qp.InterfaceC18797a
    public void clear() {
        C18531a c18531a = (C18531a) this.f47885Y;
        Map map = (Map) c18531a.get();
        if (map != null) {
            map.clear();
            c18531a.remove();
        }
    }

    /* JADX INFO: renamed from: d */
    public String m16553d(Object value) {
        AbstractC16544l.m18094g(value, "value");
        return AbstractC18201b.f58034a.m12905d((KSerializer) this.f47885Y, value);
    }

    /* JADX INFO: renamed from: e */
    public void m16554e() {
        Socket socket;
        C3179x c3179x = (C3179x) this.f47885Y;
        Iterator it = ((ConcurrentLinkedQueue) c3179x.f9589p0).iterator();
        AbstractC16544l.m18093f(it, "connections.iterator()");
        while (it.hasNext()) {
            C18795k connection = (C18795k) it.next();
            AbstractC16544l.m18093f(connection, "connection");
            synchronized (connection) {
                if (connection.f59753p.isEmpty()) {
                    it.remove();
                    connection.f59747j = true;
                    socket = connection.f59741d;
                    AbstractC16544l.m18091d(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC17708b.m19413e(socket);
            }
        }
        if (((ConcurrentLinkedQueue) c3179x.f9589p0).isEmpty()) {
            ((C18529c) c3179x.f9587Z).m19888a();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m16555f(int i10) {
        if (i10 >= 0) {
            C0420b c0420b = (C0420b) this.f47885Y;
            if (i10 < c0420b.f1381Z) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public C20468h m16556g(String key) {
        AbstractC16544l.m18094g(key, "key");
        List<C0389i> listM784i = new C0387g((C0388h) this.f47885Y, key, new C0386f(new C0384d(1), 0)).m784i();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM784i, 10));
        for (C0389i c0389i : listM784i) {
            arrayList.add(AbstractC8167p5.m8744d(c0389i.f1300a, c0389i.f1301b));
        }
        return (C20468h) AbstractC17680n.m19367q0(arrayList);
    }

    @Override // p975qp.InterfaceC18797a
    /* JADX INFO: renamed from: i */
    public void mo16557i(Map map) {
        ((C18531a) this.f47885Y).set(map != null ? new HashMap(map) : null);
    }

    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f47885Y;
        if (!Objects.equals(coordinatorLayout.f32865B0, c0794y0)) {
            coordinatorLayout.f32865B0 = c0794y0;
            boolean z6 = c0794y0.m1816d() > 0;
            coordinatorLayout.f32866C0 = z6;
            coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
            C0790w0 c0790w0 = c0794y0.f2209a;
            if (!c0790w0.mo1771n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    if (childAt.getFitsSystemWindows() && ((C16806e) childAt.getLayoutParams()).f53917a != null && c0790w0.mo1771n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0794y0;
    }

    @Override // p975qp.InterfaceC18797a
    /* JADX INFO: renamed from: n */
    public Map mo16558n() {
        Map map = (Map) ((C18531a) this.f47885Y).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public C15333a(KSerializer serializer) {
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f47885Y = serializer;
    }

    public C15333a(int i10) {
        switch (i10) {
            case 3:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                AbstractC16544l.m18094g(timeUnit, "timeUnit");
                this.f47885Y = new C3179x(C18530d.f59039h, timeUnit);
                break;
            case 4:
                new ThreadLocal();
                this.f47885Y = new C18531a();
                break;
            case 5:
            case 6:
            default:
                this.f47885Y = new C15498c(new C8990d(21));
                break;
            case 7:
                this.f47885Y = new C0095w0(12);
                break;
        }
    }
}
