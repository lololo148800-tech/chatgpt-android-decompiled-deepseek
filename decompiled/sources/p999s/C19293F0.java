package p999s;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p976r.C18811i;
import p976r.C18816n;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: s.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19293F0 extends C19369o0 {

    /* JADX INFO: renamed from: A0 */
    public final int f61130A0;

    /* JADX INFO: renamed from: B0 */
    public final int f61131B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC19287C0 f61132C0;

    /* JADX INFO: renamed from: D0 */
    public C18816n f61133D0;

    public C19293F0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f61130A0 = 21;
            this.f61131B0 = 22;
        } else {
            this.f61130A0 = 22;
            this.f61131B0 = 21;
        }
    }

    @Override // p999s.C19369o0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C18811i c18811i;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f61132C0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c18811i = (C18811i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c18811i = (C18811i) adapter;
                headersCount = 0;
            }
            C18816n c18816nM20119b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= c18811i.getCount()) ? null : c18811i.getItem(i10);
            C18816n c18816n = this.f61133D0;
            if (c18816n != c18816nM20119b) {
                MenuC18814l menuC18814l = c18811i.f59838a;
                if (c18816n != null) {
                    this.f61132C0.mo10221u(menuC18814l, c18816n);
                }
                this.f61133D0 = c18816nM20119b;
                if (c18816nM20119b != null) {
                    this.f61132C0.mo10199K(menuC18814l, c18816nM20119b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f61130A0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f61131B0) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C18811i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C18811i) adapter).f59838a.m20122c(false);
        return true;
    }

    public void setHoverListener(InterfaceC19287C0 interfaceC19287C0) {
        this.f61132C0 = interfaceC19287C0;
    }

    @Override // p999s.C19369o0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
