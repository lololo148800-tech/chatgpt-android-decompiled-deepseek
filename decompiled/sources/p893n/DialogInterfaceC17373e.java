package p893n;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.view.C10827j;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.datepicker.ViewOnClickListenerC12047l;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0731L;
import p030B2.AbstractC0738T;
import p030B2.InterfaceC0769m;
import p501Ub.ExecutorC7613o;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8748z;
import p772h.DialogC14229k;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC17373e extends DialogC14229k implements DialogInterface, InterfaceC17376h {

    /* JADX INFO: renamed from: p0 */
    public LayoutInflaterFactory2C17390v f55479p0;

    /* JADX INFO: renamed from: q0 */
    public final C17391w f55480q0;

    /* JADX INFO: renamed from: r0 */
    public final C17372d f55481r0;

    /* JADX WARN: Type inference failed for: r2v2, types: [n.w] */
    public DialogInterfaceC17373e(ContextThemeWrapper contextThemeWrapper, int i10) {
        int i11;
        int iM19047j = m19047j(contextThemeWrapper, i10);
        if (iM19047j == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = iM19047j;
        }
        super(contextThemeWrapper, i11);
        this.f55480q0 = new InterfaceC0769m() { // from class: n.w
            @Override // p030B2.InterfaceC0769m
            /* JADX INFO: renamed from: f */
            public final boolean mo1712f(KeyEvent keyEvent) {
                return this.f55576Y.m19052l(keyEvent);
            }
        };
        AbstractC17379k abstractC17379kM19048e = m19048e();
        if (iM19047j == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM19047j = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C17390v) abstractC17379kM19048e).f55557f1 = iM19047j;
        abstractC17379kM19048e.mo19066e();
        this.f55481r0 = new C17372d(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: j */
    public static int m19047j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19048e();
        layoutInflaterFactory2C17390v.m19105z();
        ((ViewGroup) layoutInflaterFactory2C17390v.f55538M0.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C17390v.f55574y0.m19082b(layoutInflaterFactory2C17390v.f55573x0.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m19048e().mo19067f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC8154o0.m8713d(this.f55480q0, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC17379k m19048e() {
        if (this.f55479p0 == null) {
            ExecutorC7613o executorC7613o = AbstractC17379k.f55484Y;
            this.f55479p0 = new LayoutInflaterFactory2C17390v(getContext(), getWindow(), this, this);
        }
        return this.f55479p0;
    }

    /* JADX INFO: renamed from: f */
    public final void m19049f() {
        AbstractC7841A0.m8092d(getWindow().getDecorView(), this);
        AbstractC8104h6.m8585d(getWindow().getDecorView(), this);
        AbstractC8748z.m9503d(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19048e();
        layoutInflaterFactory2C17390v.m19105z();
        return layoutInflaterFactory2C17390v.f55573x0.findViewById(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m19050g(Bundle bundle) {
        m19048e().mo19065c();
        super.onCreate(bundle);
        m19048e().mo19066e();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19048e();
        if (layoutInflaterFactory2C17390v.f55526A0 != null) {
            layoutInflaterFactory2C17390v.m19089E();
            layoutInflaterFactory2C17390v.f55526A0.getClass();
            layoutInflaterFactory2C17390v.m19090F(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m19051k(CharSequence charSequence) {
        super.setTitle(charSequence);
        m19048e().mo19072m(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m19052l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        m19050g(bundle);
        C17372d c17372d = this.f55481r0;
        c17372d.f55454b.setContentView(c17372d.f55476x);
        Window window = c17372d.f55455c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM19046a = C17372d.m19046a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM19046a2 = C17372d.m19046a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM19046a3 = C17372d.m19046a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c17372d.f55468p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c17372d.f55468p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM19046a2.findViewById(android.R.id.message);
        c17372d.f55472t = textView;
        if (textView != null) {
            String str = c17372d.f55457e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c17372d.f55468p.removeView(c17372d.f55472t);
                if (c17372d.f55458f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c17372d.f55468p.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c17372d.f55468p);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c17372d.f55458f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM19046a2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM19046a3.findViewById(android.R.id.button1);
        c17372d.f55459g = button;
        ViewOnClickListenerC12047l viewOnClickListenerC12047l = c17372d.f55452D;
        button.setOnClickListener(viewOnClickListenerC12047l);
        if (TextUtils.isEmpty(c17372d.f55460h)) {
            c17372d.f55459g.setVisibility(8);
            i10 = 0;
        } else {
            c17372d.f55459g.setText(c17372d.f55460h);
            c17372d.f55459g.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupM19046a3.findViewById(android.R.id.button2);
        c17372d.f55462j = button2;
        button2.setOnClickListener(viewOnClickListenerC12047l);
        if (TextUtils.isEmpty(c17372d.f55463k)) {
            c17372d.f55462j.setVisibility(8);
        } else {
            c17372d.f55462j.setText(c17372d.f55463k);
            c17372d.f55462j.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupM19046a3.findViewById(android.R.id.button3);
        c17372d.f55465m = button3;
        button3.setOnClickListener(viewOnClickListenerC12047l);
        if (TextUtils.isEmpty(c17372d.f55466n)) {
            c17372d.f55465m.setVisibility(8);
        } else {
            c17372d.f55465m.setText(c17372d.f55466n);
            c17372d.f55465m.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c17372d.f55453a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = c17372d.f55459g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = c17372d.f55462j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = c17372d.f55465m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupM19046a3.setVisibility(8);
        }
        if (c17372d.f55473u != null) {
            viewGroupM19046a.addView(c17372d.f55473u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c17372d.f55470r = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c17372d.f55456d) || !c17372d.f55450B) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c17372d.f55470r.setVisibility(8);
                viewGroupM19046a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c17372d.f55471s = textView2;
                textView2.setText(c17372d.f55456d);
                Drawable drawable = c17372d.f55469q;
                if (drawable != null) {
                    c17372d.f55470r.setImageDrawable(drawable);
                } else {
                    c17372d.f55471s.setPadding(c17372d.f55470r.getPaddingLeft(), c17372d.f55470r.getPaddingTop(), c17372d.f55470r.getPaddingRight(), c17372d.f55470r.getPaddingBottom());
                    c17372d.f55470r.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupM19046a == null || viewGroupM19046a.getVisibility() == 8) ? 0 : 1;
        boolean z10 = viewGroupM19046a3.getVisibility() != 8;
        if (!z10 && (viewFindViewById = viewGroupM19046a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = c17372d.f55468p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c17372d.f55457e == null && c17372d.f55458f == null) ? null : viewGroupM19046a.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM19046a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c17372d.f55458f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z10 || i11 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f32075o0, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f32076p0);
            }
        }
        if (!z6) {
            View view = c17372d.f55458f;
            if (view == null) {
                view = c17372d.f55468p;
            }
            if (view != null) {
                int i12 = (z10 ? 2 : 0) | i11;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                AbstractC0731L.m1558b(view, i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM19046a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM19046a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c17372d.f55458f;
        if (alertController$RecycleListView2 == null || (listAdapter = c17372d.f55474v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = c17372d.f55475w;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f55481r0.f55468p;
        if (nestedScrollView == null || !nestedScrollView.m11393i(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f55481r0.f55468p;
        if (nestedScrollView == null || !nestedScrollView.m11393i(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) m19048e();
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e != null) {
            c17368e.f55432u = false;
            C10827j c10827j = c17368e.f55431t;
            if (c10827j != null) {
                c10827j.m11118a();
            }
        }
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void setContentView(int i10) {
        m19049f();
        m19048e().mo19069i(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        m19048e().mo19072m(getContext().getString(i10));
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void setContentView(View view) {
        m19049f();
        m19048e().mo19070j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m19051k(charSequence);
        C17372d c17372d = this.f55481r0;
        c17372d.f55456d = charSequence;
        TextView textView = c17372d.f55471s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p772h.DialogC14229k, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m19049f();
        m19048e().mo19071k(view, layoutParams);
    }
}
