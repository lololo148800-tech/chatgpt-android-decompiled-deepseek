package p976r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p588Y2.C9642z;
import p911o0.AbstractC17792x;
import p999s.AbstractC19289D0;
import p999s.AbstractC19291E0;
import p999s.C19295G0;
import p999s.C19369o0;
import p999s.C19386x;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC18808f extends AbstractC18822t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A0 */
    public View f59805A0;

    /* JADX INFO: renamed from: B0 */
    public int f59806B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f59807C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f59808D0;

    /* JADX INFO: renamed from: E0 */
    public int f59809E0;

    /* JADX INFO: renamed from: F0 */
    public int f59810F0;

    /* JADX INFO: renamed from: H0 */
    public boolean f59812H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC18825w f59813I0;

    /* JADX INFO: renamed from: J0 */
    public ViewTreeObserver f59814J0;

    /* JADX INFO: renamed from: K0 */
    public C18823u f59815K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f59816L0;

    /* JADX INFO: renamed from: Z */
    public final Context f59817Z;

    /* JADX INFO: renamed from: o0 */
    public final int f59818o0;

    /* JADX INFO: renamed from: p0 */
    public final int f59819p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f59820q0;

    /* JADX INFO: renamed from: r0 */
    public final Handler f59821r0;

    /* JADX INFO: renamed from: z0 */
    public View f59829z0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f59822s0 = new ArrayList();

    /* JADX INFO: renamed from: t0 */
    public final ArrayList f59823t0 = new ArrayList();

    /* JADX INFO: renamed from: u0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC18806d f59824u0 = new ViewTreeObserverOnGlobalLayoutListenerC18806d(this, 0);

    /* JADX INFO: renamed from: v0 */
    public final ViewOnAttachStateChangeListenerC0171H f59825v0 = new ViewOnAttachStateChangeListenerC0171H(this, 7);

    /* JADX INFO: renamed from: w0 */
    public final C9642z f59826w0 = new C9642z(this, 19);

    /* JADX INFO: renamed from: x0 */
    public int f59827x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f59828y0 = 0;

    /* JADX INFO: renamed from: G0 */
    public boolean f59811G0 = false;

    public ViewOnKeyListenerC18808f(Context context, View view, int i10, boolean z6) {
        this.f59817Z = context;
        this.f59829z0 = view;
        this.f59819p0 = i10;
        this.f59820q0 = z6;
        this.f59806B0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f59818o0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f59821r0 = new Handler();
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: a */
    public final boolean mo20082a() {
        ArrayList arrayList = this.f59823t0;
        return arrayList.size() > 0 && ((C18807e) arrayList.get(0)).f59802a.f61106L0.isShowing();
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: b */
    public final void mo20085b(InterfaceC18825w interfaceC18825w) {
        this.f59813I0 = interfaceC18825w;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: c */
    public final void mo20086c(MenuC18814l menuC18814l, boolean z6) {
        ArrayList arrayList = this.f59823t0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (menuC18814l == ((C18807e) arrayList.get(i10)).f59803b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((C18807e) arrayList.get(i11)).f59803b.m20122c(false);
        }
        C18807e c18807e = (C18807e) arrayList.remove(i10);
        c18807e.f59803b.m20129r(this);
        boolean z10 = this.f59816L0;
        C19295G0 c19295g0 = c18807e.f59802a;
        if (z10) {
            AbstractC19289D0.m20361b(c19295g0.f61106L0, null);
            c19295g0.f61106L0.setAnimationStyle(0);
        }
        c19295g0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f59806B0 = ((C18807e) arrayList.get(size2 - 1)).f59804c;
        } else {
            this.f59806B0 = this.f59829z0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((C18807e) arrayList.get(0)).f59803b.m20122c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC18825w interfaceC18825w = this.f59813I0;
        if (interfaceC18825w != null) {
            interfaceC18825w.mo10212c(menuC18814l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f59814J0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f59814J0.removeGlobalOnLayoutListener(this.f59824u0);
            }
            this.f59814J0 = null;
        }
        this.f59805A0.removeOnAttachStateChangeListener(this.f59825v0);
        this.f59815K0.onDismiss();
    }

    @Override // p976r.InterfaceC18800B
    public final void dismiss() {
        ArrayList arrayList = this.f59823t0;
        int size = arrayList.size();
        if (size > 0) {
            C18807e[] c18807eArr = (C18807e[]) arrayList.toArray(new C18807e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C18807e c18807e = c18807eArr[i10];
                if (c18807e.f59802a.f61106L0.isShowing()) {
                    c18807e.f59802a.dismiss();
                }
            }
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: e */
    public final boolean mo20087e() {
        return false;
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: f */
    public final void mo20083f() {
        if (mo20082a()) {
            return;
        }
        ArrayList arrayList = this.f59822s0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m20112v((MenuC18814l) it.next());
        }
        arrayList.clear();
        View view = this.f59829z0;
        this.f59805A0 = view;
        if (view != null) {
            boolean z6 = this.f59814J0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f59814J0 = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f59824u0);
            }
            this.f59805A0.addOnAttachStateChangeListener(this.f59825v0);
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: g */
    public final boolean mo20088g(SubMenuC18802D subMenuC18802D) {
        for (C18807e c18807e : this.f59823t0) {
            if (subMenuC18802D == c18807e.f59803b) {
                c18807e.f59802a.f61109o0.requestFocus();
                return true;
            }
        }
        if (!subMenuC18802D.hasVisibleItems()) {
            return false;
        }
        mo20090l(subMenuC18802D);
        InterfaceC18825w interfaceC18825w = this.f59813I0;
        if (interfaceC18825w != null) {
            interfaceC18825w.mo10214g(subMenuC18802D);
        }
        return true;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: h */
    public final void mo20089h() {
        Iterator it = this.f59823t0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C18807e) it.next()).f59802a.f61109o0.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C18811i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: i */
    public final C19369o0 mo20084i() {
        ArrayList arrayList = this.f59823t0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C18807e) AbstractC17792x.m19532o(1, arrayList)).f59802a.f61109o0;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: l */
    public final void mo20090l(MenuC18814l menuC18814l) {
        menuC18814l.m20121b(this, this.f59817Z);
        if (mo20082a()) {
            m20112v(menuC18814l);
        } else {
            this.f59822s0.add(menuC18814l);
        }
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: n */
    public final void mo20091n(View view) {
        if (this.f59829z0 != view) {
            this.f59829z0 = view;
            this.f59828y0 = Gravity.getAbsoluteGravity(this.f59827x0, view.getLayoutDirection());
        }
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: o */
    public final void mo20092o(boolean z6) {
        this.f59811G0 = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C18807e c18807e;
        ArrayList arrayList = this.f59823t0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c18807e = null;
                break;
            }
            c18807e = (C18807e) arrayList.get(i10);
            if (!c18807e.f59802a.f61106L0.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (c18807e != null) {
            c18807e.f59803b.m20122c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: p */
    public final void mo20093p(int i10) {
        if (this.f59827x0 != i10) {
            this.f59827x0 = i10;
            this.f59828y0 = Gravity.getAbsoluteGravity(i10, this.f59829z0.getLayoutDirection());
        }
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: q */
    public final void mo20094q(int i10) {
        this.f59807C0 = true;
        this.f59809E0 = i10;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: r */
    public final void mo20095r(PopupWindow.OnDismissListener onDismissListener) {
        this.f59815K0 = (C18823u) onDismissListener;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: s */
    public final void mo20096s(boolean z6) {
        this.f59812H0 = z6;
    }

    @Override // p976r.AbstractC18822t
    /* JADX INFO: renamed from: t */
    public final void mo20097t(int i10) {
        this.f59808D0 = true;
        this.f59810F0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX INFO: renamed from: v */
    public final void m20112v(MenuC18814l menuC18814l) {
        View childAt;
        C18807e c18807e;
        int i10;
        char c9;
        int i11;
        int i12;
        int width;
        MenuItem item;
        C18811i c18811i;
        int headersCount;
        int i13;
        int firstVisiblePosition;
        Context context = this.f59817Z;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C18811i c18811i2 = new C18811i(menuC18814l, layoutInflaterFrom, this.f59820q0, R.layout.abc_cascading_menu_item_layout);
        if (!mo20082a() && this.f59811G0) {
            c18811i2.f59840c = true;
        } else if (mo20082a()) {
            c18811i2.f59840c = AbstractC18822t.m20141u(menuC18814l);
        }
        int iM20140m = AbstractC18822t.m20140m(c18811i2, context, this.f59818o0);
        C19295G0 c19295g0 = new C19295G0(context, null, this.f59819p0);
        C19386x c19386x = c19295g0.f61106L0;
        c19295g0.f61139P0 = this.f59826w0;
        c19295g0.f61096B0 = this;
        c19386x.setOnDismissListener(this);
        c19295g0.f61095A0 = this.f59829z0;
        c19295g0.f61118x0 = this.f59828y0;
        c19295g0.f61105K0 = true;
        c19386x.setFocusable(true);
        c19386x.setInputMethodMode(2);
        c19295g0.mo20354n(c18811i2);
        c19295g0.m20356p(iM20140m);
        c19295g0.f61118x0 = this.f59828y0;
        ArrayList arrayList = this.f59823t0;
        if (arrayList.size() > 0) {
            c18807e = (C18807e) AbstractC17792x.m19532o(1, arrayList);
            MenuC18814l menuC18814l2 = c18807e.f59803b;
            int size = menuC18814l2.f59850f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    item = null;
                    break;
                }
                item = menuC18814l2.getItem(i14);
                if (item.hasSubMenu() && menuC18814l == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C19369o0 c19369o0 = c18807e.f59802a.f61109o0;
                ListAdapter adapter = c19369o0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c18811i = (C18811i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c18811i = (C18811i) adapter;
                    headersCount = 0;
                }
                int count = c18811i.getCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= count) {
                        i13 = -1;
                        i15 = -1;
                        break;
                    } else {
                        if (item == c18811i.getItem(i15)) {
                            i13 = -1;
                            break;
                        }
                        i15++;
                    }
                }
                childAt = (i15 != i13 && (firstVisiblePosition = (i15 + headersCount) - c19369o0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c19369o0.getChildCount()) ? c19369o0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            childAt = null;
            c18807e = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C19295G0.f61138Q0;
                if (method != null) {
                    try {
                        method.invoke(c19386x, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC19291E0.m20362a(c19386x, false);
            }
            AbstractC19289D0.m20360a(c19386x, null);
            C19369o0 c19369o1 = ((C18807e) arrayList.get(arrayList.size() - 1)).f59802a.f61109o0;
            int[] iArr = new int[2];
            c19369o1.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f59805A0.getWindowVisibleDisplayFrame(rect);
            if (this.f59806B0 == 1) {
                if (c19369o1.getWidth() + iArr[0] + iM20140m > rect.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iM20140m < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z6 = i10 == 1;
            this.f59806B0 = i10;
            if (Build.VERSION.SDK_INT >= 26) {
                c19295g0.f61095A0 = childAt;
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f59829z0.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f59828y0 & 7) == 5) {
                    c9 = 0;
                    iArr2[0] = this.f59829z0.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c9 = 0;
                }
                i11 = iArr3[c9] - iArr2[c9];
                i12 = iArr3[1] - iArr2[1];
            }
            if ((this.f59828y0 & 5) == 5) {
                width = z6 ? i11 + iM20140m : i11 - childAt.getWidth();
            } else {
                width = z6 ? i11 + childAt.getWidth() : i11 - iM20140m;
            }
            c19295g0.f61112r0 = width;
            c19295g0.f61117w0 = true;
            c19295g0.f61116v0 = true;
            c19295g0.m20352j(i12);
        } else {
            if (this.f59807C0) {
                c19295g0.f61112r0 = this.f59809E0;
            }
            if (this.f59808D0) {
                c19295g0.m20352j(this.f59810F0);
            }
            Rect rect2 = this.f59911Y;
            c19295g0.f61104J0 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C18807e(c19295g0, menuC18814l, this.f59806B0));
        c19295g0.mo20083f();
        C19369o0 c19369o2 = c19295g0.f61109o0;
        c19369o2.setOnKeyListener(this);
        if (c18807e == null && this.f59812H0 && menuC18814l.f59857m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c19369o2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC18814l.f59857m);
            c19369o2.addHeaderView(frameLayout, null, false);
            c19295g0.mo20083f();
        }
    }
}
