package p742f6;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p520V5.C7781j;
import p523V9.AbstractC7846A5;
import p604Yk.C10077b;
import p660b6.C11249a;
import p660b6.C11250b;
import p660b6.C11251c;
import p660b6.C11252d;
import p660b6.InterfaceC11253e;
import p764g6.C13822b;
import p802i6.C14935a;
import p802i6.C14936b;

/* JADX INFO: renamed from: f6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13551c {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42876a = C15384c.m16635u("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static final C15384c f42877b = C15384c.m16635u("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C11252d m15089a(C13822b c13822b, C7781j c7781j) {
        C11249a c11249a;
        C11250b c11250bM8100c;
        List list;
        C11250b c11250b;
        C11250b c11250b2;
        boolean z6;
        boolean z10 = false;
        Object[] objArr = c13822b.mo15424P() == 3;
        if (objArr != false) {
            c13822b.mo15430e();
        }
        C11250b c11250b3 = null;
        C11250b c11250bM8100c2 = null;
        C10077b c10077bM15087a = null;
        InterfaceC11253e interfaceC11253eM15088b = null;
        C11249a c11249a2 = null;
        C11250b c11250bM8100c3 = null;
        C11249a c11249aM8102e = null;
        C11250b c11250bM8100c4 = null;
        C11250b c11250bM8100c5 = null;
        while (c13822b.hasNext()) {
            switch (c13822b.mo15427T(f42876a)) {
                case 0:
                    c13822b.mo15430e();
                    while (c13822b.hasNext()) {
                        if (c13822b.mo15427T(f42877b) != 0) {
                            c13822b.mo15428W();
                            c13822b.mo15421D();
                        } else {
                            c10077bM15087a = AbstractC13549a.m15087a(c13822b, c7781j);
                        }
                    }
                    c13822b.mo15434m();
                    c11250bM8100c2 = c11250bM8100c2;
                    z10 = false;
                    break;
                case 1:
                    interfaceC11253eM15088b = AbstractC13549a.m15088b(c13822b, c7781j);
                    z10 = false;
                    break;
                case 2:
                    c11249a2 = new C11249a(4, AbstractC13564p.m15097a(c13822b, c7781j, 1.0f, C13554f.f42886s0, z10));
                    c11250bM8100c2 = c11250bM8100c2;
                    z10 = false;
                    break;
                case 3:
                    c7781j.m8039a("Lottie doesn't support 3D layers.");
                    c11250bM8100c = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    list = (List) c11250bM8100c.f11539Z;
                    if (list.isEmpty()) {
                        c11250b = c11250bM8100c;
                        c11250b2 = c11250bM8100c2;
                        if (((C14935a) list.get(z10 ? 1 : 0)).f46525b == null) {
                            z6 = false;
                            list.set(0, new C14935a(c7781j, Float.valueOf(0.0f), Float.valueOf(0.0f), (BaseInterpolator) null, 0.0f, Float.valueOf(c7781j.f24592m)));
                        }
                        z10 = z6;
                        c11250b3 = c11250b;
                        c11250bM8100c2 = c11250b2;
                    } else {
                        c11250b = c11250bM8100c;
                        c11250b2 = c11250bM8100c2;
                        list.add(new C14935a(c7781j, Float.valueOf(0.0f), Float.valueOf(0.0f), (BaseInterpolator) null, 0.0f, Float.valueOf(c7781j.f24592m)));
                    }
                    z6 = false;
                    z10 = z6;
                    c11250b3 = c11250b;
                    c11250bM8100c2 = c11250b2;
                    break;
                case 4:
                    c11250bM8100c = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    list = (List) c11250bM8100c.f11539Z;
                    if (list.isEmpty()) {
                        c11250b = c11250bM8100c;
                        c11250b2 = c11250bM8100c2;
                        if (((C14935a) list.get(z10 ? 1 : 0)).f46525b == null) {
                            z6 = false;
                            list.set(0, new C14935a(c7781j, Float.valueOf(0.0f), Float.valueOf(0.0f), (BaseInterpolator) null, 0.0f, Float.valueOf(c7781j.f24592m)));
                        }
                        z10 = z6;
                        c11250b3 = c11250b;
                        c11250bM8100c2 = c11250b2;
                    } else {
                        c11250b = c11250bM8100c;
                        c11250b2 = c11250bM8100c2;
                        list.add(new C14935a(c7781j, Float.valueOf(0.0f), Float.valueOf(0.0f), (BaseInterpolator) null, 0.0f, Float.valueOf(c7781j.f24592m)));
                    }
                    z6 = false;
                    z10 = z6;
                    c11250b3 = c11250b;
                    c11250bM8100c2 = c11250b2;
                    break;
                case 5:
                    c11249aM8102e = AbstractC7846A5.m8102e(c13822b, c7781j);
                    break;
                case 6:
                    c11250bM8100c4 = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    break;
                case 7:
                    c11250bM8100c5 = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    break;
                case 8:
                    c11250bM8100c3 = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    break;
                case 9:
                    c11250bM8100c2 = AbstractC7846A5.m8100c(c13822b, c7781j, z10);
                    break;
                default:
                    c13822b.mo15428W();
                    c13822b.mo15421D();
                    break;
            }
        }
        C11250b c11250b4 = c11250bM8100c2;
        if (objArr != false) {
            c13822b.mo15434m();
        }
        C10077b c10077b = (c10077bM15087a == null || (c10077bM15087a.isStatic() && ((PointF) ((C14935a) ((ArrayList) c10077bM15087a.f29833Z).get(0)).f46525b).equals(0.0f, 0.0f))) ? null : c10077bM15087a;
        InterfaceC11253e interfaceC11253e = (interfaceC11253eM15088b == null || (!(interfaceC11253eM15088b instanceof C11251c) && interfaceC11253eM15088b.isStatic() && ((PointF) ((C14935a) interfaceC11253eM15088b.mo4538w().get(0)).f46525b).equals(0.0f, 0.0f))) ? null : interfaceC11253eM15088b;
        if (c11250b3 == null || (c11250b3.isStatic() && ((Float) ((C14935a) ((List) c11250b3.f11539Z).get(0)).f46525b).floatValue() == 0.0f)) {
            c11250b3 = null;
        }
        if (c11249a2 == null) {
            c11249a = null;
        } else {
            if (c11249a2.isStatic()) {
                C14936b c14936b = (C14936b) ((C14935a) ((List) c11249a2.f11539Z).get(0)).f46525b;
                if (c14936b.f46540a == 1.0f && c14936b.f46541b == 1.0f) {
                    c11249a = null;
                }
            }
            c11249a = c11249a2;
        }
        return new C11252d(c10077b, interfaceC11253e, c11249a, c11250b3, c11249aM8102e, c11250bM8100c4, c11250bM8100c5, (c11250bM8100c3 == null || (c11250bM8100c3.isStatic() && ((Float) ((C14935a) ((List) c11250bM8100c3.f11539Z).get(0)).f46525b).floatValue() == 0.0f)) ? null : c11250bM8100c3, (c11250b4 == 0 || (c11250b4.isStatic() && ((Float) ((C14935a) ((List) c11250b4.f11539Z).get(0)).f46525b).floatValue() == 0.0f)) ? null : c11250b4);
    }
}
