package p330N4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import java.util.HashMap;

/* JADX INFO: renamed from: N4.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5648N extends AbstractC5673x {

    /* JADX INFO: renamed from: K0 */
    public static final String[] f18355K0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: J0 */
    public int f18356J0 = 3;

    /* JADX INFO: renamed from: I */
    public static void m6079I(C5640F c5640f) {
        int visibility = c5640f.f18321b.getVisibility();
        HashMap map = c5640f.f18320a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c5640f.f18321b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: J */
    public static C5647M m6080J(C5640F c5640f, C5640F c5640f2) {
        C5647M c5647m = new C5647M();
        c5647m.f18349a = false;
        c5647m.f18350b = false;
        if (c5640f != null) {
            HashMap map = c5640f.f18320a;
            if (map.containsKey("android:visibility:visibility")) {
                c5647m.f18351c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c5647m.f18353e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c5647m.f18351c = -1;
                c5647m.f18353e = null;
            }
        } else {
            c5647m.f18351c = -1;
            c5647m.f18353e = null;
        }
        if (c5640f2 != null) {
            HashMap map2 = c5640f2.f18320a;
            if (map2.containsKey("android:visibility:visibility")) {
                c5647m.f18352d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c5647m.f18354f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c5647m.f18352d = -1;
                c5647m.f18354f = null;
            }
        } else {
            c5647m.f18352d = -1;
            c5647m.f18354f = null;
        }
        if (c5640f != null && c5640f2 != null) {
            int i10 = c5647m.f18351c;
            int i11 = c5647m.f18352d;
            if (i10 == i11 && c5647m.f18353e == c5647m.f18354f) {
                return c5647m;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    c5647m.f18350b = false;
                    c5647m.f18349a = true;
                } else if (i11 == 0) {
                    c5647m.f18350b = true;
                    c5647m.f18349a = true;
                }
            } else if (c5647m.f18354f == null) {
                c5647m.f18350b = false;
                c5647m.f18349a = true;
            } else if (c5647m.f18353e == null) {
                c5647m.f18350b = true;
                c5647m.f18349a = true;
            }
        } else if (c5640f == null && c5647m.f18352d == 0) {
            c5647m.f18350b = true;
            c5647m.f18349a = true;
        } else if (c5640f2 == null && c5647m.f18351c == 0) {
            c5647m.f18350b = false;
            c5647m.f18349a = true;
        }
        return c5647m;
    }

    /* JADX INFO: renamed from: K */
    public abstract ObjectAnimator mo6081K(ViewGroup viewGroup, View view, C5640F c5640f, C5640F c5640f2);

    /* JADX INFO: renamed from: L */
    public abstract ObjectAnimator mo6082L(ViewGroup viewGroup, View view, C5640F c5640f);

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public void mo6056c(C5640F c5640f) {
        m6079I(c5640f);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (m6080J(m6103o(r5, false), m6104r(r5, false)).f18349a != false) goto L20;
     */
    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo6083j(ViewGroup viewGroup, C5640F c5640f, C5640F c5640f2) {
        boolean z6;
        View view;
        int i10;
        View view2;
        View view3;
        View view4;
        int id2;
        ImageView imageView;
        boolean z10;
        boolean zIsAttachedToWindow;
        boolean z11;
        int i11;
        ViewGroup viewGroup2;
        int iRound;
        Bitmap bitmapCreateBitmap;
        C5647M c5647mM6080J = m6080J(c5640f, c5640f2);
        if (!c5647mM6080J.f18349a || (c5647mM6080J.f18353e == null && c5647mM6080J.f18354f == null)) {
            return null;
        }
        boolean z12 = false;
        if (c5647mM6080J.f18350b) {
            if ((this.f18356J0 & 1) == 1 && c5640f2 != null) {
                View view5 = c5640f2.f18321b;
                if (c5640f == null) {
                    View view6 = (View) view5.getParent();
                }
                return mo6081K(viewGroup, view5, c5640f, c5640f2);
            }
            return null;
        }
        int i12 = c5647mM6080J.f18352d;
        if ((this.f18356J0 & 2) == 2 && c5640f != null) {
            View view7 = c5640f2 != null ? c5640f2.f18321b : null;
            View view8 = c5640f.f18321b;
            View view9 = (View) view8.getTag(R.id.save_overlay_view);
            if (view9 != null) {
                i10 = i12;
                z12 = true;
                view3 = null;
            } else {
                if (view7 == null || view7.getParent() == null) {
                    if (view7 != null) {
                        z6 = false;
                    }
                    view = null;
                    if (!z6) {
                        i10 = i12;
                        view2 = view;
                        view9 = view7;
                        view3 = view2;
                        z12 = false;
                    } else if (view8.getParent() == null) {
                        i10 = i12;
                        view3 = view;
                        view9 = view8;
                    } else {
                        if (view8.getParent() instanceof View) {
                            view4 = (View) view8.getParent();
                            if (m6080J(m6104r(view4, true), m6103o(view4, true)).f18349a) {
                                i10 = i12;
                                view2 = view;
                                id2 = view4.getId();
                                if (view4.getParent() == null && id2 != -1) {
                                    viewGroup.findViewById(id2);
                                }
                            } else {
                                boolean z13 = AbstractC5639E.f18317a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                C5643I c5643i = AbstractC5642H.f18332a;
                                c5643i.mo6074g(view8, matrix);
                                c5643i.mo6075h(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view8.getWidth(), view8.getHeight());
                                matrix.mapRect(rectF);
                                int iRound2 = Math.round(rectF.left);
                                int iRound3 = Math.round(rectF.top);
                                int iRound4 = Math.round(rectF.right);
                                int iRound5 = Math.round(rectF.bottom);
                                imageView = new ImageView(view8.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (AbstractC5639E.f18317a) {
                                    z10 = !view8.isAttachedToWindow();
                                    if (viewGroup == null) {
                                        zIsAttachedToWindow = false;
                                    } else {
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    }
                                } else {
                                    z10 = false;
                                    zIsAttachedToWindow = false;
                                }
                                z11 = AbstractC5639E.f18318b;
                                if (z11 || !z10) {
                                    i11 = 0;
                                    viewGroup2 = null;
                                } else {
                                    if (zIsAttachedToWindow) {
                                        viewGroup2 = (ViewGroup) view8.getParent();
                                        int iIndexOfChild = viewGroup2.indexOfChild(view8);
                                        viewGroup.getOverlay().add(view8);
                                        i11 = iIndexOfChild;
                                    } else {
                                        i10 = i12;
                                        view2 = view;
                                        bitmapCreateBitmap = null;
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                    imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                    view9 = imageView;
                                }
                                view2 = view;
                                iRound = Math.round(rectF.width());
                                i10 = i12;
                                int iRound6 = Math.round(rectF.height());
                                if (iRound > 0 || iRound6 <= 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                    int iRound7 = Math.round(iRound * fMin);
                                    int iRound8 = Math.round(iRound6 * fMin);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(fMin, fMin);
                                    if (AbstractC5639E.f18319c) {
                                        Picture picture = new Picture();
                                        Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                        canvasBeginRecording.concat(matrix);
                                        view8.draw(canvasBeginRecording);
                                        picture.endRecording();
                                        bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                    } else {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.concat(matrix);
                                        view8.draw(canvas);
                                    }
                                }
                                if (z11 && z10) {
                                    viewGroup.getOverlay().remove(view8);
                                    viewGroup2.addView(view8, i11);
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                view9 = imageView;
                            }
                            view3 = view2;
                            z12 = false;
                        } else {
                            i10 = i12;
                            view2 = view;
                        }
                        view9 = view7;
                        view3 = view2;
                        z12 = false;
                    }
                } else {
                    if (i12 == 4 || view8 == view7) {
                        view = view7;
                        z6 = false;
                        view7 = null;
                    }
                    if (!z6) {
                        i10 = i12;
                        view2 = view;
                        view9 = view7;
                        view3 = view2;
                        z12 = false;
                    } else if (view8.getParent() == null) {
                        i10 = i12;
                        view3 = view;
                        view9 = view8;
                    } else {
                        if (view8.getParent() instanceof View) {
                            view4 = (View) view8.getParent();
                            if (m6080J(m6104r(view4, true), m6103o(view4, true)).f18349a) {
                                boolean z14 = AbstractC5639E.f18317a;
                                Matrix matrix2 = new Matrix();
                                matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                C5643I c5643i2 = AbstractC5642H.f18332a;
                                c5643i2.mo6074g(view8, matrix2);
                                c5643i2.mo6075h(viewGroup, matrix2);
                                RectF rectF2 = new RectF(0.0f, 0.0f, view8.getWidth(), view8.getHeight());
                                matrix2.mapRect(rectF2);
                                int iRound9 = Math.round(rectF2.left);
                                int iRound10 = Math.round(rectF2.top);
                                int iRound11 = Math.round(rectF2.right);
                                int iRound12 = Math.round(rectF2.bottom);
                                imageView = new ImageView(view8.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (AbstractC5639E.f18317a) {
                                    z10 = !view8.isAttachedToWindow();
                                    if (viewGroup == null) {
                                        zIsAttachedToWindow = false;
                                    } else {
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    }
                                } else {
                                    z10 = false;
                                    zIsAttachedToWindow = false;
                                }
                                z11 = AbstractC5639E.f18318b;
                                if (z11) {
                                    i11 = 0;
                                    viewGroup2 = null;
                                    view2 = view;
                                    iRound = Math.round(rectF2.width());
                                    i10 = i12;
                                    int iRound13 = Math.round(rectF2.height());
                                    if (iRound > 0) {
                                        bitmapCreateBitmap = null;
                                    } else {
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z11) {
                                        viewGroup.getOverlay().remove(view8);
                                        viewGroup2.addView(view8, i11);
                                    }
                                } else {
                                    i11 = 0;
                                    viewGroup2 = null;
                                    view2 = view;
                                    iRound = Math.round(rectF2.width());
                                    i10 = i12;
                                    int iRound14 = Math.round(rectF2.height());
                                    if (iRound > 0) {
                                        bitmapCreateBitmap = null;
                                    } else {
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z11) {
                                        viewGroup.getOverlay().remove(view8);
                                        viewGroup2.addView(view8, i11);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                view9 = imageView;
                            } else {
                                i10 = i12;
                                view2 = view;
                                id2 = view4.getId();
                                if (view4.getParent() == null) {
                                    viewGroup.findViewById(id2);
                                }
                            }
                            view3 = view2;
                            z12 = false;
                        } else {
                            i10 = i12;
                            view2 = view;
                        }
                        view9 = view7;
                        view3 = view2;
                        z12 = false;
                    }
                }
                z6 = true;
                view7 = null;
                view = null;
                if (!z6) {
                    i10 = i12;
                    view2 = view;
                    view9 = view7;
                    view3 = view2;
                    z12 = false;
                } else if (view8.getParent() == null) {
                    i10 = i12;
                    view3 = view;
                    view9 = view8;
                } else {
                    if (view8.getParent() instanceof View) {
                        view4 = (View) view8.getParent();
                        if (m6080J(m6104r(view4, true), m6103o(view4, true)).f18349a) {
                            boolean z15 = AbstractC5639E.f18317a;
                            Matrix matrix3 = new Matrix();
                            matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                            C5643I c5643i3 = AbstractC5642H.f18332a;
                            c5643i3.mo6074g(view8, matrix3);
                            c5643i3.mo6075h(viewGroup, matrix3);
                            RectF rectF3 = new RectF(0.0f, 0.0f, view8.getWidth(), view8.getHeight());
                            matrix3.mapRect(rectF3);
                            int iRound15 = Math.round(rectF3.left);
                            int iRound16 = Math.round(rectF3.top);
                            int iRound17 = Math.round(rectF3.right);
                            int iRound18 = Math.round(rectF3.bottom);
                            imageView = new ImageView(view8.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            if (AbstractC5639E.f18317a) {
                                z10 = !view8.isAttachedToWindow();
                                if (viewGroup == null) {
                                    zIsAttachedToWindow = false;
                                } else {
                                    zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                }
                            } else {
                                z10 = false;
                                zIsAttachedToWindow = false;
                            }
                            z11 = AbstractC5639E.f18318b;
                            if (z11) {
                                i11 = 0;
                                viewGroup2 = null;
                                view2 = view;
                                iRound = Math.round(rectF3.width());
                                i10 = i12;
                                int iRound19 = Math.round(rectF3.height());
                                if (iRound > 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    bitmapCreateBitmap = null;
                                }
                                if (z11) {
                                    viewGroup.getOverlay().remove(view8);
                                    viewGroup2.addView(view8, i11);
                                }
                            } else {
                                i11 = 0;
                                viewGroup2 = null;
                                view2 = view;
                                iRound = Math.round(rectF3.width());
                                i10 = i12;
                                int iRound110 = Math.round(rectF3.height());
                                if (iRound > 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    bitmapCreateBitmap = null;
                                }
                                if (z11) {
                                    viewGroup.getOverlay().remove(view8);
                                    viewGroup2.addView(view8, i11);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound18 - iRound16, 1073741824));
                            imageView.layout(iRound15, iRound16, iRound17, iRound18);
                            view9 = imageView;
                        } else {
                            i10 = i12;
                            view2 = view;
                            id2 = view4.getId();
                            if (view4.getParent() == null) {
                                viewGroup.findViewById(id2);
                            }
                        }
                        view3 = view2;
                        z12 = false;
                    } else {
                        i10 = i12;
                        view2 = view;
                    }
                    view9 = view7;
                    view3 = view2;
                    z12 = false;
                }
            }
            if (view9 != null) {
                if (!z12) {
                    int[] iArr = (int[]) c5640f.f18320a.get("android:visibility:screenLocation");
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view9.offsetLeftAndRight((i13 - iArr2[0]) - view9.getLeft());
                    view9.offsetTopAndBottom((i14 - iArr2[1]) - view9.getTop());
                    viewGroup.getOverlay().add(view9);
                }
                ObjectAnimator objectAnimatorMo6082L = mo6082L(viewGroup, view9, c5640f);
                if (z12) {
                    return objectAnimatorMo6082L;
                }
                if (objectAnimatorMo6082L == null) {
                    viewGroup.getOverlay().remove(view9);
                    return objectAnimatorMo6082L;
                }
                view8.setTag(R.id.save_overlay_view, view9);
                m6098a(new C5645K(this, viewGroup, view9, view8));
                return objectAnimatorMo6082L;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                C5643I c5643i4 = AbstractC5642H.f18332a;
                c5643i4.mo6072d(view3, 0);
                ObjectAnimator objectAnimatorMo6082L2 = mo6082L(viewGroup, view3, c5640f);
                if (objectAnimatorMo6082L2 != null) {
                    C5646L c5646l = new C5646L(view3, i10);
                    objectAnimatorMo6082L2.addListener(c5646l);
                    objectAnimatorMo6082L2.addPauseListener(c5646l);
                    m6098a(c5646l);
                } else {
                    c5643i4.mo6072d(view3, visibility);
                }
                return objectAnimatorMo6082L2;
            }
        }
        return null;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: q */
    public final String[] mo6084q() {
        return f18355K0;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: s */
    public final boolean mo6085s(C5640F c5640f, C5640F c5640f2) {
        if (c5640f == null && c5640f2 == null) {
            return false;
        }
        if (c5640f != null && c5640f2 != null && c5640f2.f18320a.containsKey("android:visibility:visibility") != c5640f.f18320a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C5647M c5647mM6080J = m6080J(c5640f, c5640f2);
        if (c5647mM6080J.f18349a) {
            return c5647mM6080J.f18351c == 0 || c5647mM6080J.f18352d == 0;
        }
        return false;
    }
}
