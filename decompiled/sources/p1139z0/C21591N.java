package p1139z0;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import mm.EnumC17307j;
import p003A1.InterfaceC0161D1;
import p003A1.InterfaceC0255h1;
import p080D0.C1837w0;
import p1071w0.C20714I0;
import p1071w0.C20750g0;
import p204I1.C3581L;
import p350O1.C6045C;
import p350O1.C6065n;
import p389Pn.C6535t;
import p468T2.C7218j;
import p571X9.AbstractC9227W;
import p604Yk.C10077b;

/* JADX INFO: renamed from: z0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C21591N implements InterfaceC0255h1 {

    /* JADX INFO: renamed from: a */
    public final View f68372a;

    /* JADX INFO: renamed from: b */
    public final C21585H f68373b;

    /* JADX INFO: renamed from: e */
    public C20750g0 f68376e;

    /* JADX INFO: renamed from: f */
    public C1837w0 f68377f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0161D1 f68378g;

    /* JADX INFO: renamed from: l */
    public Rect f68383l;

    /* JADX INFO: renamed from: m */
    public final C21588K f68384m;

    /* JADX INFO: renamed from: c */
    public AbstractC16546n f68374c = C21603a.f68420p0;

    /* JADX INFO: renamed from: d */
    public AbstractC16546n f68375d = C21603a.f68421q0;

    /* JADX INFO: renamed from: h */
    public C6045C f68379h = new C6045C(C3581L.f10906b, "", 4);

    /* JADX INFO: renamed from: i */
    public C6065n f68380i = C6065n.f19755g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f68381j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Object f68382k = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C20714I0(this, 7));

    public C21591N(View view, C6535t c6535t, C21585H c21585h) {
        this.f68372a = view;
        this.f68373b = c21585h;
        this.f68384m = new C21588K(c6535t, c21585h);
    }

    @Override // p003A1.InterfaceC0255h1
    /* JADX INFO: renamed from: a */
    public final InputConnection mo824a(EditorInfo editorInfo) {
        C6045C c6045c = this.f68379h;
        AbstractC21627m.m21977y(editorInfo, c6045c.f19682a.f10934Y, c6045c.f19683b, this.f68380i, null);
        C21589L c21589l = AbstractC21590M.f68371a;
        if (C7218j.m7610c()) {
            C7218j.m7609a().m7616h(editorInfo);
        }
        InputConnectionC21594Q inputConnectionC21594Q = new InputConnectionC21594Q(this.f68379h, new C10077b(this, 26), this.f68380i.f19758c, this.f68376e, this.f68377f, this.f68378g);
        this.f68381j.add(new WeakReference(inputConnectionC21594Q));
        return inputConnectionC21594Q;
    }
}
