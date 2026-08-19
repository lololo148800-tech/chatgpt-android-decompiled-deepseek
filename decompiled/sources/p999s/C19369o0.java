package p999s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.openai.chatgpt.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p108E2.ViewOnTouchListenerC2246e;
import p935p.RunnableC18260f;

/* JADX INFO: renamed from: s.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C19369o0 extends ListView {

    /* JADX INFO: renamed from: o0 */
    public final Rect f61336o0;

    /* JADX INFO: renamed from: p0 */
    public int f61337p0;

    /* JADX INFO: renamed from: q0 */
    public int f61338q0;

    /* JADX INFO: renamed from: r0 */
    public int f61339r0;

    /* JADX INFO: renamed from: s0 */
    public int f61340s0;

    /* JADX INFO: renamed from: t0 */
    public int f61341t0;

    /* JADX INFO: renamed from: u0 */
    public C19365m0 f61342u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f61343v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f61344w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f61345x0;

    /* JADX INFO: renamed from: y0 */
    public ViewOnTouchListenerC2246e f61346y0;

    /* JADX INFO: renamed from: z0 */
    public RunnableC18260f f61347z0;

    public C19369o0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f61336o0 = new Rect();
        this.f61337p0 = 0;
        this.f61338q0 = 0;
        this.f61339r0 = 0;
        this.f61340s0 = 0;
        this.f61344w0 = z6;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m20471a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x017e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    public final boolean m20472b(MotionEvent motionEvent, int i10) {
        boolean z6;
        boolean zM20465a;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC2246e viewOnTouchListenerC2246e;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z6 = true;
            } else if (actionMasked != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || z10) {
                this.f61345x0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f61341t0 - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z6) {
                if (this.f61346y0 == null) {
                    this.f61346y0 = new ViewOnTouchListenerC2246e(this);
                }
                ViewOnTouchListenerC2246e viewOnTouchListenerC2246e2 = this.f61346y0;
                boolean z11 = viewOnTouchListenerC2246e2.f6874B0;
                viewOnTouchListenerC2246e2.f6874B0 = true;
                viewOnTouchListenerC2246e2.onTouch(this, motionEvent);
            } else {
                viewOnTouchListenerC2246e = this.f61346y0;
                if (viewOnTouchListenerC2246e != null) {
                    if (viewOnTouchListenerC2246e.f6874B0) {
                        viewOnTouchListenerC2246e.m3278d();
                    }
                    viewOnTouchListenerC2246e.f6874B0 = false;
                }
            }
            return z6;
        }
        z6 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z6 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y8);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x4;
                float f11 = y8;
                this.f61345x0 = true;
                int i11 = Build.VERSION.SDK_INT;
                AbstractC19359j0.m20464a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f61341t0;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f61341t0 = iPointToPosition;
                AbstractC19359j0.m20464a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f61336o0;
                rect.set(left, top, right, bottom);
                rect.left -= this.f61337p0;
                rect.top -= this.f61338q0;
                rect.right += this.f61339r0;
                rect.bottom += this.f61340s0;
                if (i11 >= 33) {
                    zM20465a = AbstractC19363l0.m20465a(this);
                } else {
                    Field field = AbstractC19367n0.f61331a;
                    if (field != null) {
                        try {
                            zM20465a = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zM20465a = false;
                        }
                    } else {
                        zM20465a = false;
                    }
                }
                if (childAt3.isEnabled() != zM20465a) {
                    boolean z13 = !zM20465a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC19363l0.m20466b(this, z13);
                    } else {
                        Field field2 = AbstractC19367n0.f61331a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                C19365m0 c19365m0 = this.f61342u0;
                if (c19365m0 != null) {
                    c19365m0.f61327Z = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z6 = true;
                z10 = false;
            }
        }
        if (z6) {
            this.f61345x0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f61341t0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f61345x0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f61341t0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z6) {
            if (this.f61346y0 == null) {
                this.f61346y0 = new ViewOnTouchListenerC2246e(this);
            }
            ViewOnTouchListenerC2246e viewOnTouchListenerC2246e3 = this.f61346y0;
            boolean z14 = viewOnTouchListenerC2246e3.f6874B0;
            viewOnTouchListenerC2246e3.f6874B0 = true;
            viewOnTouchListenerC2246e3.onTouch(this, motionEvent);
        } else {
            viewOnTouchListenerC2246e = this.f61346y0;
            if (viewOnTouchListenerC2246e != null) {
                if (viewOnTouchListenerC2246e.f6874B0) {
                    viewOnTouchListenerC2246e.m3278d();
                }
                viewOnTouchListenerC2246e.f6874B0 = false;
            }
        }
        return z6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f61336o0;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f61347z0 != null) {
            return;
        }
        super.drawableStateChanged();
        C19365m0 c19365m0 = this.f61342u0;
        if (c19365m0 != null) {
            c19365m0.f61327Z = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f61345x0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f61344w0 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f61344w0 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f61344w0 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f61344w0 && this.f61343v0) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f61347z0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = 4;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f61347z0 == null) {
            RunnableC18260f runnableC18260f = new RunnableC18260f(this, i10);
            this.f61347z0 = runnableC18260f;
            post(runnableC18260f);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i11 < 30 || !AbstractC19361k0.f61321d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC19361k0.f61318a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC19361k0.f61319b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC19361k0.f61320c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f61345x0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f61341t0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC18260f runnableC18260f = this.f61347z0;
        if (runnableC18260f != null) {
            C19369o0 c19369o0 = (C19369o0) runnableC18260f.f58208Z;
            c19369o0.f61347z0 = null;
            c19369o0.removeCallbacks(runnableC18260f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f61343v0 = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C19365m0 c19365m0 = null;
        if (drawable != null) {
            C19365m0 c19365m1 = new C19365m0();
            Drawable drawable2 = c19365m1.f61326Y;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c19365m1.f61326Y = drawable;
            drawable.setCallback(c19365m1);
            c19365m1.f61327Z = true;
            c19365m0 = c19365m1;
        }
        this.f61342u0 = c19365m0;
        super.setSelector(c19365m0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f61337p0 = rect.left;
        this.f61338q0 = rect.top;
        this.f61339r0 = rect.right;
        this.f61340s0 = rect.bottom;
    }
}
