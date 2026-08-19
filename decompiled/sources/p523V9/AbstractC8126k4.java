package p523V9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.p650ui.graphics.painter.BitmapPainter;
import androidx.compose.p650ui.graphics.vector.VectorPainter;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0010F;
import p013Ab.C0420b;
import p025An.C0644w;
import p107E1.C2238b;
import p107E1.C2239c;
import p107E1.C2240d;
import p107E1.C2241e;
import p110E4.C2315m;
import p1113xn.AbstractC21322p;
import p349O0.C6013l;
import p349O0.C6021p;
import p444S4.C6995a;
import p444S4.C7013s;
import p470T4.C7247l;
import p571X9.AbstractC9113C4;
import p658b5.C11246q;
import p692d0.C12982u;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;
import p774h1.C14341T;
import p774h1.C14351g;
import p774h1.C14361q;
import p774h1.C14365u;
import p784hb.C14438g;
import p882m1.AbstractC17140a;
import p895n1.AbstractC17418F;
import p895n1.AbstractC17421a;
import p895n1.C17417E;
import p895n1.C17420H;
import p895n1.C17423c;
import p895n1.C17424d;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p912o1.AbstractC17799b;
import p912o1.C17798a;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: V9.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8126k4 {
    /* JADX INFO: renamed from: a */
    public static final void m8630a(WorkDatabase workDatabase, C6995a configuration, C7247l continuation) {
        int i10;
        AbstractC16544l.m18094g(workDatabase, "workDatabase");
        AbstractC16544l.m18094g(configuration, "configuration");
        AbstractC16544l.m18094g(continuation, "continuation");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(continuation);
        int i11 = 0;
        while (true) {
            if (arrayListM19384m.isEmpty()) {
                if (i11 == 0) {
                    return;
                }
                C11246q c11246qMo12356t = workDatabase.mo12356t();
                c11246qMo12356t.getClass();
                InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
                InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
                C2315m c2315mM3418a = C2315m.m3418a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t.f34064a;
                workDatabase_Impl.m12339b();
                Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
                try {
                    int i12 = cursorM8212b.moveToFirst() ? cursorM8212b.getInt(0) : 0;
                    cursorM8212b.close();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    c2315mM3418a.m3425m();
                    int i13 = i12 + i11;
                    int i14 = configuration.f22385i;
                    if (i13 > i14) {
                        throw new IllegalArgumentException(AbstractC10763a.m11056n(AbstractC0010F.m21e("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i14, ";\nalready enqueued count: ", i12, ";\ncurrent enqueue operation count: "), i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
                    }
                    return;
                } catch (Throwable th2) {
                    cursorM8212b.close();
                    if (interfaceC15154QMo16291v != null) {
                        interfaceC15154QMo16291v.mo16271b();
                    }
                    c2315mM3418a.m3425m();
                    throw th2;
                }
            }
            List list = ((C7247l) AbstractC17686t.m19397E(arrayListM19384m)).f22984d;
            AbstractC16544l.m18093f(list, "current.work");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = list2.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((C7013s) it.next()).f22425b.f34050j.m7400a() && (i10 = i10 + 1) < 0) {
                        AbstractC17681o.m19387p();
                        throw null;
                    }
                }
            }
            i11 += i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03db  */
    /* JADX WARN: Code duplicated, block: B:149:0x0424  */
    /* JADX WARN: Code duplicated, block: B:150:0x0429  */
    /* JADX WARN: Code duplicated, block: B:156:0x0445 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0447  */
    /* JADX WARN: Code duplicated, block: B:158:0x044f  */
    /* JADX WARN: Code duplicated, block: B:165:0x046a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x046c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0474  */
    /* JADX WARN: Code duplicated, block: B:170:0x0486  */
    /* JADX WARN: Code duplicated, block: B:171:0x0489  */
    /* JADX WARN: Code duplicated, block: B:174:0x048f  */
    /* JADX WARN: Code duplicated, block: B:241:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:96:0x028e  */
    /* JADX INFO: renamed from: b */
    public static final AbstractC17140a m8631b(int i10, C6021p c6021p, int i11) {
        TypedValue typedValue;
        long jM15625c;
        int i12;
        C17424d c17424d;
        int i13;
        char c9;
        int i14;
        int i15;
        int i16;
        int i17;
        float fM19547a;
        C0420b c0420bM19959c;
        float fM19547a2;
        float fM19547a3;
        float fM19547a4;
        float fM19547a5;
        float fM19547a6;
        int i18;
        Shader shader;
        AbstractC14360p c14341t;
        Shader shader2;
        AbstractC14360p c14341t2;
        int i19;
        int i20 = 1;
        Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
        c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
        Resources resources = context.getResources();
        C2241e c2241e = (C2241e) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32827d);
        synchronized (c2241e) {
            typedValue = (TypedValue) c2241e.f6862a.m14694f(i10);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i10, typedValue, true);
                C12982u c12982u = c2241e.f6862a;
                int iM14692d = c12982u.m14692d(i10);
                Object[] objArr = c12982u.f41206c;
                Object obj = objArr[iM14692d];
                c12982u.f41205b[iM14692d] = i10;
                objArr[iM14692d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC21322p.m21672F(charSequence, ".xml")) {
            boolean z6 = true;
            c6021p.m6524S(-802884675);
            Object theme = context.getTheme();
            boolean zM6542f = c6021p.m6542f(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !c6021p.m6538d(i10)) && (i11 & 6) != 4) {
                z6 = false;
            }
            boolean zM6542f2 = z6 | zM6542f | c6021p.m6542f(theme);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f2 || objM6514H == C6013l.f19514a) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    AbstractC16544l.m18092e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM6514H = new C14351g(((BitmapDrawable) drawable).getBitmap());
                    c6021p.m6537c0(objM6514H);
                } catch (Exception e10) {
                    throw new C0644w("Error attempting to load resource: " + ((Object) charSequence), e10);
                }
            }
            C14351g c14351g = (C14351g) objM6514H;
            BitmapPainter bitmapPainter = new BitmapPainter(c14351g, 0L, AbstractC9113C4.m9643a(c14351g.f45036a.getWidth(), c14351g.f45036a.getHeight()));
            c6021p.m6553p(false);
            return bitmapPainter;
        }
        c6021p.m6524S(-803040357);
        Resources.Theme theme2 = context.getTheme();
        int i21 = typedValue.changingConfigurations;
        C2240d c2240d = (C2240d) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32826c);
        C2239c c2239c = new C2239c(theme2, i10);
        WeakReference weakReference = (WeakReference) c2240d.f6861a.get(c2239c);
        C2238b c2238b = weakReference != null ? (C2238b) weakReference.get() : null;
        if (c2238b == null) {
            XmlResourceParser xml = resources.getXml(i10);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!AbstractC16544l.m18089b(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            C17798a c17798a = new C17798a(xml);
            TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources, theme2, attributeSetAsAttributeSet, AbstractC17799b.f56786a);
            c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
            boolean z10 = !AbstractC18610b.m19961e(xml, "autoMirrored") ? false : typedArrayM19964h.getBoolean(5, false);
            c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
            float fM19547a7 = c17798a.m19547a(typedArrayM19964h, "viewportWidth", 7, 0.0f);
            float fM19547a8 = c17798a.m19547a(typedArrayM19964h, "viewportHeight", 8, 0.0f);
            if (fM19547a7 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fM19547a8 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            int i22 = 3;
            float dimension = typedArrayM19964h.getDimension(3, 0.0f);
            c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
            float dimension2 = typedArrayM19964h.getDimension(2, 0.0f);
            c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
            if (typedArrayM19964h.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayM19964h.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jM15625c = C14365u.f45060j;
                } else {
                    ColorStateList colorStateListM19958b = AbstractC18610b.m19958b(typedArrayM19964h, xml, theme2);
                    c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
                    jM15625c = colorStateListM19958b != null ? AbstractC14334L.m15625c(colorStateListM19958b.getDefaultColor()) : C14365u.f45060j;
                }
            } else {
                jM15625c = C14365u.f45060j;
            }
            long j10 = jM15625c;
            int i23 = typedArrayM19964h.getInt(6, -1);
            c17798a.m19548b(typedArrayM19964h.getChangingConfigurations());
            if (i23 == -1) {
                i12 = 5;
            } else if (i23 == 3) {
                i12 = 3;
            } else if (i23 == 5) {
                i12 = 5;
            } else if (i23 != 9) {
                switch (i23) {
                    case 14:
                        i12 = 13;
                        break;
                    case 15:
                        i12 = 14;
                        break;
                    case 16:
                        i12 = 12;
                        break;
                    default:
                        i12 = 5;
                        break;
                }
            } else {
                i12 = 9;
            }
            float f10 = dimension / resources.getDisplayMetrics().density;
            float f11 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayM19964h.recycle();
            C17424d c17424d2 = new C17424d(null, f10, f11, fM19547a7, fM19547a8, j10, i12, z10, 1);
            int i24 = 0;
            while (xml.getEventType() != i20 && (xml.getDepth() >= i20 || xml.getEventType() != i22)) {
                XmlResourceParser xmlResourceParser = c17798a.f56783a;
                int eventType = xmlResourceParser.getEventType();
                if (eventType == 2) {
                    xml = xml;
                    C17424d c17424d3 = c17424d2;
                    Resources.Theme theme3 = theme2;
                    i21 = i21;
                    c2240d = c2240d;
                    c2239c = c2239c;
                    String name = xmlResourceParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        List listM15960e = C17689w.f56480Y;
                        C14438g c14438g = c17798a.f56785c;
                        if (iHashCode != -1649314686) {
                            if (iHashCode == 3433509) {
                                c17424d = c17424d3;
                                theme2 = theme3;
                                if (name.equals("path")) {
                                    TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources, theme2, attributeSetAsAttributeSet, AbstractC17799b.f56788c);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    if (!AbstractC18610b.m19961e(xmlResourceParser, "pathData")) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string = typedArrayM19964h2.getString(0);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    String string2 = typedArrayM19964h2.getString(2);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    if (string2 == null) {
                                        int i25 = AbstractC17418F.f55636a;
                                    } else {
                                        listM15960e = C14438g.m15960e(c14438g, string2);
                                    }
                                    List list = listM15960e;
                                    C0420b c0420bM19959c2 = AbstractC18610b.m19959c(typedArrayM19964h2, c17798a.f56783a, theme2, "fillColor", 1);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    float fM19547a9 = c17798a.m19547a(typedArrayM19964h2, "fillAlpha", 12, 1.0f);
                                    int i26 = !AbstractC18610b.m19961e(c17798a.f56783a, "strokeLineCap") ? -1 : typedArrayM19964h2.getInt(8, -1);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    if (i26 != 0) {
                                        if (i26 != 1) {
                                            i14 = 2;
                                            if (i26 == 2) {
                                                i15 = 2;
                                            }
                                        } else {
                                            i14 = 2;
                                            i15 = 1;
                                        }
                                        if (AbstractC18610b.m19961e(c17798a.f56783a, "strokeLineJoin")) {
                                            c9 = '\t';
                                            i16 = typedArrayM19964h2.getInt(9, -1);
                                        } else {
                                            i16 = -1;
                                            c9 = '\t';
                                        }
                                        c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                        if (i16 != 0) {
                                            i17 = 0;
                                        } else if (i16 != 1) {
                                            i17 = i14;
                                        } else {
                                            i17 = 1;
                                        }
                                        fM19547a = c17798a.m19547a(typedArrayM19964h2, "strokeMiterLimit", 10, 1.0f);
                                        c0420bM19959c = AbstractC18610b.m19959c(typedArrayM19964h2, c17798a.f56783a, theme2, "strokeColor", 3);
                                        c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                        fM19547a2 = c17798a.m19547a(typedArrayM19964h2, "strokeAlpha", 11, 1.0f);
                                        fM19547a3 = c17798a.m19547a(typedArrayM19964h2, "strokeWidth", 4, 1.0f);
                                        fM19547a4 = c17798a.m19547a(typedArrayM19964h2, "trimPathEnd", 6, 1.0f);
                                        fM19547a5 = c17798a.m19547a(typedArrayM19964h2, "trimPathOffset", 7, 0.0f);
                                        fM19547a6 = c17798a.m19547a(typedArrayM19964h2, "trimPathStart", 5, 0.0f);
                                        if (AbstractC18610b.m19961e(c17798a.f56783a, "fillType")) {
                                            i18 = typedArrayM19964h2.getInt(13, 0);
                                        } else {
                                            i18 = 0;
                                        }
                                        c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                        typedArrayM19964h2.recycle();
                                        shader = (Shader) c0420bM19959c2.f1382o0;
                                        if (shader == null && c0420bM19959c2.f1381Z == 0) {
                                            c14341t = null;
                                        } else if (shader != null) {
                                            c14341t = new C14361q(shader);
                                        } else {
                                            c14341t = new C14341T(AbstractC14334L.m15625c(c0420bM19959c2.f1381Z));
                                        }
                                        shader2 = (Shader) c0420bM19959c.f1382o0;
                                        if (shader2 == null && c0420bM19959c.f1381Z == 0) {
                                            c14341t2 = null;
                                        } else if (shader2 != null) {
                                            c14341t2 = new C14361q(shader2);
                                        } else {
                                            c14341t2 = new C14341T(AbstractC14334L.m15625c(c0420bM19959c.f1381Z));
                                        }
                                        if (i18 == 0) {
                                            i19 = 0;
                                        } else {
                                            i19 = 1;
                                        }
                                        if (!c17424d.f55691k) {
                                            AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        ((C17423c) AbstractC17792x.m19532o(1, c17424d.f55689i)).f55680j.add(new C17420H(str, list, i19, c14341t, fM19547a9, c14341t2, fM19547a2, fM19547a3, i15, i17, fM19547a, fM19547a6, fM19547a4, fM19547a5));
                                    } else {
                                        i14 = 2;
                                    }
                                    i15 = 0;
                                    if (AbstractC18610b.m19961e(c17798a.f56783a, "strokeLineJoin")) {
                                        i16 = -1;
                                        c9 = '\t';
                                    } else {
                                        c9 = '\t';
                                        i16 = typedArrayM19964h2.getInt(9, -1);
                                    }
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    if (i16 != 0) {
                                        i17 = 0;
                                    } else if (i16 != 1) {
                                        i17 = i14;
                                    } else {
                                        i17 = 1;
                                    }
                                    fM19547a = c17798a.m19547a(typedArrayM19964h2, "strokeMiterLimit", 10, 1.0f);
                                    c0420bM19959c = AbstractC18610b.m19959c(typedArrayM19964h2, c17798a.f56783a, theme2, "strokeColor", 3);
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    fM19547a2 = c17798a.m19547a(typedArrayM19964h2, "strokeAlpha", 11, 1.0f);
                                    fM19547a3 = c17798a.m19547a(typedArrayM19964h2, "strokeWidth", 4, 1.0f);
                                    fM19547a4 = c17798a.m19547a(typedArrayM19964h2, "trimPathEnd", 6, 1.0f);
                                    fM19547a5 = c17798a.m19547a(typedArrayM19964h2, "trimPathOffset", 7, 0.0f);
                                    fM19547a6 = c17798a.m19547a(typedArrayM19964h2, "trimPathStart", 5, 0.0f);
                                    if (AbstractC18610b.m19961e(c17798a.f56783a, "fillType")) {
                                        i18 = 0;
                                    } else {
                                        i18 = typedArrayM19964h2.getInt(13, 0);
                                    }
                                    c17798a.m19548b(typedArrayM19964h2.getChangingConfigurations());
                                    typedArrayM19964h2.recycle();
                                    shader = (Shader) c0420bM19959c2.f1382o0;
                                    if (shader == null) {
                                        c14341t = null;
                                    } else if (shader != null) {
                                        c14341t = new C14361q(shader);
                                    } else {
                                        c14341t = new C14341T(AbstractC14334L.m15625c(c0420bM19959c2.f1381Z));
                                    }
                                    shader2 = (Shader) c0420bM19959c.f1382o0;
                                    if (shader2 == null) {
                                        c14341t2 = null;
                                    } else if (shader2 != null) {
                                        c14341t2 = new C14361q(shader2);
                                    } else {
                                        c14341t2 = new C14341T(AbstractC14334L.m15625c(c0420bM19959c.f1381Z));
                                    }
                                    if (i18 == 0) {
                                        i19 = 0;
                                    } else {
                                        i19 = 1;
                                    }
                                    if (!c17424d.f55691k) {
                                        AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    ((C17423c) AbstractC17792x.m19532o(1, c17424d.f55689i)).f55680j.add(new C17420H(str, list, i19, c14341t, fM19547a9, c14341t2, fM19547a2, fM19547a3, i15, i17, fM19547a, fM19547a6, fM19547a4, fM19547a5));
                                }
                            } else if (iHashCode == 98629247 && name.equals("group")) {
                                theme2 = theme3;
                                TypedArray typedArrayM19964h3 = AbstractC18610b.m19964h(resources, theme2, attributeSetAsAttributeSet, AbstractC17799b.f56787b);
                                c17798a.m19548b(typedArrayM19964h3.getChangingConfigurations());
                                float fM19547a10 = c17798a.m19547a(typedArrayM19964h3, "rotation", 5, 0.0f);
                                float f12 = typedArrayM19964h3.getFloat(1, 0.0f);
                                c17798a.m19548b(typedArrayM19964h3.getChangingConfigurations());
                                float f13 = typedArrayM19964h3.getFloat(2, 0.0f);
                                c17798a.m19548b(typedArrayM19964h3.getChangingConfigurations());
                                float fM19547a11 = c17798a.m19547a(typedArrayM19964h3, "scaleX", 3, 1.0f);
                                float fM19547a12 = c17798a.m19547a(typedArrayM19964h3, "scaleY", 4, 1.0f);
                                float fM19547a13 = c17798a.m19547a(typedArrayM19964h3, "translateX", 6, 0.0f);
                                float fM19547a14 = c17798a.m19547a(typedArrayM19964h3, "translateY", 7, 0.0f);
                                String string3 = typedArrayM19964h3.getString(0);
                                c17798a.m19548b(typedArrayM19964h3.getChangingConfigurations());
                                String str2 = string3 == null ? "" : string3;
                                typedArrayM19964h3.recycle();
                                int i27 = AbstractC17418F.f55636a;
                                c17424d = c17424d3;
                                if (c17424d.f55691k) {
                                    AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c17424d.f55689i.add(new C17423c(str2, fM19547a10, f12, f13, fM19547a11, fM19547a12, fM19547a13, fM19547a14, listM15960e, 512));
                            } else {
                                c17424d = c17424d3;
                                theme2 = theme3;
                            }
                            i13 = 1;
                            c9 = '\t';
                        } else {
                            c17424d = c17424d3;
                            theme2 = theme3;
                            c9 = '\t';
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayM19964h4 = AbstractC18610b.m19964h(resources, theme2, attributeSetAsAttributeSet, AbstractC17799b.f56789d);
                                c17798a.m19548b(typedArrayM19964h4.getChangingConfigurations());
                                String string4 = typedArrayM19964h4.getString(0);
                                c17798a.m19548b(typedArrayM19964h4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = typedArrayM19964h4.getString(1);
                                c17798a.m19548b(typedArrayM19964h4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i28 = AbstractC17418F.f55636a;
                                } else {
                                    listM15960e = C14438g.m15960e(c14438g, string5);
                                }
                                List list2 = listM15960e;
                                typedArrayM19964h4.recycle();
                                if (c17424d.f55691k) {
                                    AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                c17424d.f55689i.add(new C17423c(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i13 = 1;
                                i24++;
                            }
                        }
                        i13 = 1;
                    } else {
                        c17424d = c17424d3;
                        theme2 = theme3;
                        i13 = 1;
                        c9 = '\t';
                    }
                } else if (eventType == i22 && "group".equals(xmlResourceParser.getName())) {
                    int i29 = 1;
                    int i30 = i24 + 1;
                    int i31 = 0;
                    while (i31 < i30) {
                        if (c17424d2.f55691k) {
                            AbstractC8111i5.m8592c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            throw null;
                        }
                        ArrayList arrayList = c17424d2.f55689i;
                        C17423c c17423c = (C17423c) arrayList.remove(arrayList.size() - i29);
                        ((C17423c) AbstractC17792x.m19532o(i29, arrayList)).f55680j.add(new C17417E(c17423c.f55671a, c17423c.f55672b, c17423c.f55673c, c17423c.f55674d, c17423c.f55675e, c17423c.f55676f, c17423c.f55677g, c17423c.f55678h, c17423c.f55679i, c17423c.f55680j));
                        i31++;
                        i29 = 1;
                        i30 = i30;
                        c2239c = c2239c;
                        c2240d = c2240d;
                        i21 = i21;
                        xml = xml;
                        c17424d2 = c17424d2;
                        theme2 = theme2;
                    }
                    xml = xml;
                    i21 = i21;
                    c2240d = c2240d;
                    c2239c = c2239c;
                    theme2 = theme2;
                    i24 = 0;
                    c9 = '\t';
                    c17424d = c17424d2;
                    i13 = i29;
                } else {
                    c9 = '\t';
                    c17424d = c17424d2;
                    i13 = 1;
                }
                xml.next();
                i20 = i13;
                c17424d2 = c17424d;
                c2239c = c2239c;
                c2240d = c2240d;
                i21 = i21;
                xml = xml;
                i22 = 3;
                theme2 = theme2;
            }
            C2240d c2240d2 = c2240d;
            C2239c c2239c2 = c2239c;
            c2238b = new C2238b(c17424d2.m19122b(), i21);
            c2240d2.f6861a.put(c2239c2, new WeakReference(c2238b));
        }
        VectorPainter vectorPainterM19116c = AbstractC17421a.m19116c(c2238b.f6857a, c6021p);
        c6021p.m6553p(false);
        return vectorPainterM19116c;
    }
}
