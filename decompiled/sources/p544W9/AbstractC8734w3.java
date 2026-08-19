package p544W9;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.openai.chatgpt.R;
import io.sentry.C15524y1;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import io.sentry.android.replay.viewhierarchy.C15313a;
import io.sentry.android.replay.viewhierarchy.C15314b;
import io.sentry.android.replay.viewhierarchy.C15315c;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21328v;
import p1113xn.AbstractC21329w;
import p588Y2.C9642z;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.w3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8734w3 {
    /* JADX WARN: Code duplicated, block: B:115:0x0209  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[LOOP:0: B:54:0x0115->B:58:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[LOOP:1: B:60:0x0138->B:64:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX INFO: renamed from: a */
    public static AbstractC15316d m9464a(View view, AbstractC15316d abstractC15316d, int i10, C15524y1 c15524y1) {
        C17309l c17309l;
        boolean z6;
        boolean z10;
        boolean z11;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (true) {
                if (!(parent instanceof View)) {
                    Rect rect = new Rect();
                    c17309l = new C17309l(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
                    break;
                }
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    c17309l = new C17309l(Boolean.FALSE, null);
                    break;
                }
                parent = view2.getParent();
            }
        } else {
            c17309l = new C17309l(Boolean.FALSE, null);
        }
        boolean zBooleanValue = ((Boolean) c17309l.f55136Y).booleanValue();
        Rect rect2 = (Rect) c17309l.f55137Z;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (AbstractC21322p.m21667A(lowerCase2, "sentry-unmask", false)) {
                    z6 = false;
                } else if (AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "unmask")) {
                    z6 = false;
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!AbstractC21322p.m21667A(lowerCase, "sentry-mask", false)) {
                            if (!AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "mask")) {
                                c15524y1.getExperimental().f48340a.getClass();
                                if (view.getParent() != null) {
                                    AbstractC16544l.m18093f(view.getParent(), "this.parent");
                                    c15524y1.getExperimental().f48340a.getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = c15524y1.getExperimental().f48340a.f47052d;
                                AbstractC16544l.m18093f(copyOnWriteArraySet, "options.experimental.ses…nReplay.unmaskViewClasses");
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = c15524y1.getExperimental().f48340a.f47051c;
                                        AbstractC16544l.m18093f(copyOnWriteArraySet2, "options.experimental.sessionReplay.maskViewClasses");
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                    z6 = false;
                                }
                            }
                        }
                        z6 = true;
                    } else {
                        if (!AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "mask")) {
                            c15524y1.getExperimental().f48340a.getClass();
                            if (view.getParent() != null) {
                                AbstractC16544l.m18093f(view.getParent(), "this.parent");
                                c15524y1.getExperimental().f48340a.getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = c15524y1.getExperimental().f48340a.f47052d;
                            AbstractC16544l.m18093f(copyOnWriteArraySet, "options.experimental.ses…nReplay.unmaskViewClasses");
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = c15524y1.getExperimental().f48340a.f47051c;
                                    AbstractC16544l.m18093f(copyOnWriteArraySet2, "options.experimental.sessionReplay.maskViewClasses");
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                                z6 = false;
                            }
                        }
                        z6 = true;
                    }
                }
            } else if (AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "unmask")) {
                z6 = false;
            } else {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (!AbstractC21322p.m21667A(lowerCase, "sentry-mask", false)) {
                        if (!AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "mask")) {
                            c15524y1.getExperimental().f48340a.getClass();
                            if (view.getParent() != null) {
                                AbstractC16544l.m18093f(view.getParent(), "this.parent");
                                c15524y1.getExperimental().f48340a.getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = c15524y1.getExperimental().f48340a.f47052d;
                            AbstractC16544l.m18093f(copyOnWriteArraySet, "options.experimental.ses…nReplay.unmaskViewClasses");
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = c15524y1.getExperimental().f48340a.f47051c;
                                    AbstractC16544l.m18093f(copyOnWriteArraySet2, "options.experimental.sessionReplay.maskViewClasses");
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                                z6 = false;
                            }
                        }
                    }
                    z6 = true;
                } else {
                    if (!AbstractC16544l.m18089b(view.getTag(R.id.sentry_privacy), "mask")) {
                        c15524y1.getExperimental().f48340a.getClass();
                        if (view.getParent() != null) {
                            AbstractC16544l.m18093f(view.getParent(), "this.parent");
                            c15524y1.getExperimental().f48340a.getClass();
                        }
                        superclass = view.getClass();
                        copyOnWriteArraySet = c15524y1.getExperimental().f48340a.f47052d;
                        AbstractC16544l.m18093f(copyOnWriteArraySet, "options.experimental.ses…nReplay.unmaskViewClasses");
                        while (true) {
                            if (superclass != null) {
                                superclass2 = view.getClass();
                                copyOnWriteArraySet2 = c15524y1.getExperimental().f48340a.f47051c;
                                AbstractC16544l.m18093f(copyOnWriteArraySet2, "options.experimental.sessionReplay.maskViewClasses");
                                while (true) {
                                    if (superclass2 != null) {
                                        if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                            superclass2 = superclass2.getSuperclass();
                                        }
                                    }
                                }
                            } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                superclass = superclass.getSuperclass();
                            }
                            z6 = false;
                        }
                    }
                    z6 = true;
                }
            }
        } else {
            z6 = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            C9642z c9642z = layout != null ? new C9642z(layout, 11) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            return new C15315c(c9642z, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), textView.getElevation() + (abstractC15316d != null ? abstractC15316d.f47845c : 0.0f), i10, abstractC15316d, z6, true, zBooleanValue, rect2);
        }
        if (!(view instanceof ImageView)) {
            view.getX();
            view.getY();
            return new C15313a(view.getWidth(), view.getHeight(), (abstractC15316d != null ? abstractC15316d.f47845c : 0.0f) + view.getElevation(), abstractC15316d, z6, rect2);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = (abstractC15316d != null ? abstractC15316d.f47845c : 0.0f) + imageView.getElevation();
        if (z6) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                z11 = false;
            } else {
                if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return new C15314b(width, height, elevation, abstractC15316d, z10, rect2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m9465b(Object obj) {
        String string;
        Integer numM21736w;
        Object objM21719f = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && (numM21736w = AbstractC21329w.m21736w(str)) != null) {
            objM21719f = numM21736w;
        } else if (str != null) {
            objM21719f = AbstractC21328v.m21719f(str);
        }
        return (objM21719f == null || (string = objM21719f.toString()) == null) ? obj : string;
    }

    /* JADX INFO: renamed from: c */
    public static Object m9466c(Object obj) {
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        return list.size() == 1 ? m9466c(AbstractC17680n.m19343S(list)) : obj;
    }
}
