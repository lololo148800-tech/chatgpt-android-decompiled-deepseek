package p955q2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p084D4.C1949x0;
import p904nb.RunnableC17544a;
import p979r2.AbstractC18865f;

/* JADX INFO: renamed from: q2.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18619k {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f59299a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f59300b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f59301c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m19974a(C18618j c18618j, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f59301c) {
            try {
                WeakHashMap weakHashMap = f59300b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c18618j);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c18618j, sparseArray);
                }
                sparseArray.append(i10, new C18617i(colorStateList, c18618j.f59297a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m19975b(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m19976c(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX INFO: renamed from: c */
    public static Typeface m19976c(Context context, int i10, TypedValue typedValue, int i11, AbstractC18610b abstractC18610b, boolean z6, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM20176a = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            C1949x0 c1949x0 = AbstractC18865f.f60094b;
            Typeface typefaceMo8361k = (Typeface) c1949x0.m3122g(AbstractC18865f.m20177b(resources, i10, string, i12, i11));
            if (typefaceMo8361k != null) {
                if (abstractC18610b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC17544a(abstractC18610b, 2, typefaceMo8361k));
                }
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC18612d interfaceC18612dM19965k = AbstractC18610b.m19965k(resources.getXml(i10), resources);
                        if (interfaceC18612dM19965k == null) {
                            AbstractC15256t.m16465c("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC18610b != null) {
                                abstractC18610b.m19969a(-3);
                            }
                        } else {
                            typefaceM20176a = AbstractC18865f.m20176a(context, interfaceC18612dM19965k, resources, i10, string, typedValue.assetCookie, i11, abstractC18610b, z6);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        typefaceMo8361k = AbstractC18865f.f60093a.mo8361k(context, resources, i10, string, i11);
                        if (typefaceMo8361k != null) {
                            c1949x0.m3126k(AbstractC18865f.m20177b(resources, i10, string, i13, i11), typefaceMo8361k);
                        }
                        if (abstractC18610b != null) {
                            if (typefaceMo8361k != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC17544a(abstractC18610b, 2, typefaceMo8361k));
                            } else {
                                abstractC18610b.m19969a(-3);
                            }
                        }
                    }
                } catch (IOException e10) {
                    AbstractC15256t.m16466d("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (abstractC18610b != null) {
                        abstractC18610b.m19969a(-3);
                    }
                } catch (XmlPullParserException e11) {
                    AbstractC15256t.m16466d("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (abstractC18610b != null) {
                        abstractC18610b.m19969a(-3);
                    }
                }
            }
            typefaceM20176a = typefaceMo8361k;
        } else if (abstractC18610b != null) {
            abstractC18610b.m19969a(-3);
        }
        if (typefaceM20176a != null || abstractC18610b != null || z10) {
            return typefaceM20176a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
