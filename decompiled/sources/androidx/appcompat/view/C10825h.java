package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p880m.AbstractC17123a;
import p913o2.AbstractC17803d;
import p976r.ActionProviderVisibilityListenerC18817o;
import p976r.MenuC18814l;
import p999s.AbstractC19357i0;

/* JADX INFO: renamed from: androidx.appcompat.view.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10825h extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f32128e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f32129f;

    /* JADX INFO: renamed from: a */
    public final Object[] f32130a;

    /* JADX INFO: renamed from: b */
    public final Object[] f32131b;

    /* JADX INFO: renamed from: c */
    public final Context f32132c;

    /* JADX INFO: renamed from: d */
    public Object f32133d;

    static {
        Class[] clsArr = {Context.class};
        f32128e = clsArr;
        f32129f = clsArr;
    }

    public C10825h(Context context) {
        super(context);
        this.f32132c = context;
        Object[] objArr = {context};
        this.f32130a = objArr;
        this.f32131b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m11116a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m11116a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.appcompat.view.h] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: b */
    public final void m11117b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r6;
        int i10;
        ?? r10;
        ColorStateList colorStateList;
        int resourceId;
        C10824g c10824g = new C10824g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r6 = 1;
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z6 = false;
        boolean z10 = false;
        String str = null;
        while (!z6) {
            if (eventType == r6) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z10) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    C10825h c10825h = c10824g.f32101E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = c10825h.f32132c.obtainStyledAttributes(attributeSet, AbstractC17123a.f54747p);
                        c10824g.f32103b = ObtainStyledAttributes.getResourceId(r6, 0);
                        c10824g.f32104c = ObtainStyledAttributes.getInt(3, 0);
                        c10824g.f32105d = ObtainStyledAttributes.getInt(4, 0);
                        c10824g.f32106e = ObtainStyledAttributes.getInt(5, 0);
                        c10824g.f32107f = ObtainStyledAttributes.getBoolean(2, r6);
                        c10824g.f32108g = ObtainStyledAttributes.getBoolean(0, r6);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = c10825h.f32132c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54748q);
                        c10824g.f32110i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        c10824g.f32111j = (typedArrayObtainStyledAttributes.getInt(5, c10824g.f32104c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, c10824g.f32105d) & 65535);
                        c10824g.f32112k = typedArrayObtainStyledAttributes.getText(7);
                        c10824g.f32113l = typedArrayObtainStyledAttributes.getText(8);
                        c10824g.f32114m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        c10824g.f32115n = string == null ? (char) 0 : string.charAt(0);
                        c10824g.f32116o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        c10824g.f32117p = string2 == null ? (char) 0 : string2.charAt(0);
                        c10824g.f32118q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            c10824g.f32119r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c10824g.f32119r = c10824g.f32106e;
                        }
                        c10824g.f32120s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        c10824g.f32121t = typedArrayObtainStyledAttributes.getBoolean(4, c10824g.f32107f);
                        c10824g.f32122u = typedArrayObtainStyledAttributes.getBoolean(1, c10824g.f32108g);
                        c10824g.f32123v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        c10824g.f32126y = typedArrayObtainStyledAttributes.getString(12);
                        c10824g.f32124w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        c10824g.f32125x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z11 = string3 != null;
                        if (z11 && c10824g.f32124w == 0 && c10824g.f32125x == null) {
                            c10824g.f32127z = (ActionProviderVisibilityListenerC18817o) c10824g.m11114a(string3, f32129f, c10825h.f32131b);
                        } else {
                            if (z11) {
                                AbstractC15256t.m16482t("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c10824g.f32127z = null;
                        }
                        c10824g.f32097A = typedArrayObtainStyledAttributes.getText(17);
                        c10824g.f32098B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            c10824g.f32100D = AbstractC19357i0.m20463b(typedArrayObtainStyledAttributes.getInt(19, -1), c10824g.f32100D);
                        } else {
                            c10824g.f32100D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC17803d.m19556c(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            c10824g.f32099C = colorStateList;
                        } else {
                            c10824g.f32099C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        c10824g.f32109h = false;
                        r10 = 1;
                    } else if (name2.equals("menu")) {
                        r10 = 1;
                        c10824g.f32109h = true;
                        SubMenu subMenuAddSubMenu = c10824g.f32102a.addSubMenu(c10824g.f32103b, c10824g.f32110i, c10824g.f32111j, c10824g.f32112k);
                        c10824g.m11115b(subMenuAddSubMenu.getItem());
                        m11117b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        r10 = 1;
                        str = name2;
                        z10 = true;
                    }
                }
                r10 = r6;
                z6 = z6;
            } else if (eventType != 3) {
                r10 = r6;
                z6 = z6;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z10 && name3.equals(str)) {
                    r10 = r6;
                    z10 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c10824g.f32103b = 0;
                        c10824g.f32104c = 0;
                        c10824g.f32105d = 0;
                        c10824g.f32106e = 0;
                        c10824g.f32107f = r6;
                        c10824g.f32108g = r6;
                    } else if (name3.equals("item")) {
                        if (!c10824g.f32109h) {
                            ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o = c10824g.f32127z;
                            if (actionProviderVisibilityListenerC18817o == null || !actionProviderVisibilityListenerC18817o.f59902b.hasSubMenu()) {
                                c10824g.f32109h = r6;
                                c10824g.m11115b(c10824g.f32102a.add(c10824g.f32103b, c10824g.f32110i, c10824g.f32111j, c10824g.f32112k));
                            } else {
                                c10824g.f32109h = r6;
                                c10824g.m11115b(c10824g.f32102a.addSubMenu(c10824g.f32103b, c10824g.f32110i, c10824g.f32111j, c10824g.f32112k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r11 = r6;
                        z6 = r11 == true ? 1 : 0;
                        r10 = r11;
                    }
                    r10 = r6;
                    z6 = z6;
                }
            }
            eventType = xmlResourceParser.next();
            r6 = r10;
            i10 = 2;
            z6 = z6;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof MenuC18814l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f32132c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC18814l) {
                    MenuC18814l menuC18814l = (MenuC18814l) menu;
                    if (!menuC18814l.f59860p) {
                        menuC18814l.m20134w();
                        z6 = true;
                    }
                }
                m11117b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((MenuC18814l) menu).m20133v();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z6) {
                ((MenuC18814l) menu).m20133v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
