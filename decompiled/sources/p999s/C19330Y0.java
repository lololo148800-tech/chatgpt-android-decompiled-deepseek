package p999s;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: s.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19330Y0 implements InterfaceC19355h0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f61223a;

    /* JADX INFO: renamed from: b */
    public int f61224b;

    /* JADX INFO: renamed from: c */
    public View f61225c;

    /* JADX INFO: renamed from: d */
    public Drawable f61226d;

    /* JADX INFO: renamed from: e */
    public Drawable f61227e;

    /* JADX INFO: renamed from: f */
    public Drawable f61228f;

    /* JADX INFO: renamed from: g */
    public boolean f61229g;

    /* JADX INFO: renamed from: h */
    public CharSequence f61230h;

    /* JADX INFO: renamed from: i */
    public CharSequence f61231i;

    /* JADX INFO: renamed from: j */
    public CharSequence f61232j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f61233k;

    /* JADX INFO: renamed from: l */
    public boolean f61234l;

    /* JADX INFO: renamed from: m */
    public C19356i f61235m;

    /* JADX INFO: renamed from: n */
    public int f61236n;

    /* JADX INFO: renamed from: o */
    public Drawable f61237o;

    /* JADX INFO: renamed from: a */
    public final void m20428a(int i10) {
        View view;
        int i11 = this.f61224b ^ i10;
        this.f61224b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m20429b();
                }
                int i12 = this.f61224b & 4;
                Toolbar toolbar = this.f61223a;
                if (i12 != 0) {
                    Drawable drawable = this.f61228f;
                    if (drawable == null) {
                        drawable = this.f61237o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                m20430c();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f61223a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f61230h);
                    toolbar2.setSubtitle(this.f61231i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f61225c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20429b() {
        if ((this.f61224b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f61232j);
            Toolbar toolbar = this.f61223a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f61236n);
            } else {
                toolbar.setNavigationContentDescription(this.f61232j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20430c() {
        Drawable drawable;
        int i10 = this.f61224b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f61227e) == null) {
            drawable = this.f61226d;
        }
        this.f61223a.setLogo(drawable);
    }
}
