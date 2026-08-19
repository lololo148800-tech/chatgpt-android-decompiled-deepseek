package p976r;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: r.v */
/* JADX INFO: loaded from: classes.dex */
public class C18824v {

    /* JADX INFO: renamed from: a */
    public final Context f59913a;

    /* JADX INFO: renamed from: b */
    public final MenuC18814l f59914b;

    /* JADX INFO: renamed from: c */
    public final boolean f59915c;

    /* JADX INFO: renamed from: d */
    public final int f59916d;

    /* JADX INFO: renamed from: e */
    public View f59917e;

    /* JADX INFO: renamed from: g */
    public boolean f59919g;

    /* JADX INFO: renamed from: h */
    public InterfaceC18825w f59920h;

    /* JADX INFO: renamed from: i */
    public AbstractC18822t f59921i;

    /* JADX INFO: renamed from: j */
    public C18823u f59922j;

    /* JADX INFO: renamed from: f */
    public int f59918f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C18823u f59923k = new C18823u(this);

    public C18824v(int i10, Context context, View view, MenuC18814l menuC18814l, boolean z6) {
        this.f59913a = context;
        this.f59914b = menuC18814l;
        this.f59917e = view;
        this.f59915c = z6;
        this.f59916d = i10;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC18822t m20142a() {
        AbstractC18822t viewOnKeyListenerC18801C;
        if (this.f59921i == null) {
            Context context = this.f59913a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC18801C = new ViewOnKeyListenerC18808f(context, this.f59917e, this.f59916d, this.f59915c);
            } else {
                View view = this.f59917e;
                Context context2 = this.f59913a;
                boolean z6 = this.f59915c;
                viewOnKeyListenerC18801C = new ViewOnKeyListenerC18801C(this.f59916d, context2, view, this.f59914b, z6);
            }
            viewOnKeyListenerC18801C.mo20090l(this.f59914b);
            viewOnKeyListenerC18801C.mo20095r(this.f59923k);
            viewOnKeyListenerC18801C.mo20091n(this.f59917e);
            viewOnKeyListenerC18801C.mo20085b(this.f59920h);
            viewOnKeyListenerC18801C.mo20092o(this.f59919g);
            viewOnKeyListenerC18801C.mo20093p(this.f59918f);
            this.f59921i = viewOnKeyListenerC18801C;
        }
        return this.f59921i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20143b() {
        AbstractC18822t abstractC18822t = this.f59921i;
        return abstractC18822t != null && abstractC18822t.mo20082a();
    }

    /* JADX INFO: renamed from: c */
    public void mo20144c() {
        this.f59921i = null;
        C18823u c18823u = this.f59922j;
        if (c18823u != null) {
            c18823u.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20145d(int i10, int i11, boolean z6, boolean z10) {
        AbstractC18822t abstractC18822tM20142a = m20142a();
        abstractC18822tM20142a.mo20096s(z10);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f59918f, this.f59917e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f59917e.getWidth();
            }
            abstractC18822tM20142a.mo20094q(i10);
            abstractC18822tM20142a.mo20097t(i11);
            int i12 = (int) ((this.f59913a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC18822tM20142a.f59911Y = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        abstractC18822tM20142a.mo20083f();
    }
}
