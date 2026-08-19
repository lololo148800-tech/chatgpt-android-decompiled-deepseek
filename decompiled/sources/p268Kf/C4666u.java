package p268Kf;

import android.app.Application;
import android.app.assist.AssistStructure;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.service.voice.VoiceInteractionSession;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import ao.C11158d;
import bo.C11527o;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import gd.C13969n2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import md.AbstractC17237k;
import md.C17232f;
import md.C17235i;
import md.C17236j;
import mm.C17309l;
import mm.C17314q;
import org.json.JSONArray;
import org.json.JSONObject;
import p025An.C0644w;
import p033B5.C0842z;
import p040Bd.C1193x2;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2180g;
import p1113xn.AbstractC21322p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21980Z0;
import p1155zi.C21984a1;
import p1155zi.C22020j1;
import p195Hh.C3430e;
import p197Hj.C3457c;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p230J1.AbstractC4181h;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p324Mn.C5556z;
import p360Od.C6172d;
import p360Od.EnumC6173e;
import p403Qd.C6617X;
import p403Qd.C6636i;
import p451Sb.C7102a;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p575Xd.C9433B;
import p575Xd.C9440I;
import p575Xd.C9463v;
import p594Y9.AbstractC9961r4;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p787he.C14459O;
import p817j$.time.Instant;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17685s;
import p929oi.AbstractC18201b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C4666u {

    /* JADX INFO: renamed from: a */
    public final C14459O f15195a;

    /* JADX INFO: renamed from: b */
    public final C13969n2 f15196b;

    /* JADX INFO: renamed from: c */
    public final C4668w f15197c;

    /* JADX INFO: renamed from: d */
    public final C17236j f15198d;

    /* JADX INFO: renamed from: e */
    public final C17314q f15199e = AbstractC9227W.m9800c(new C3457c(this, 13));

    /* JADX INFO: renamed from: f */
    public final C3430e f15200f = AbstractC8168p6.m8749b("ClientActionsCoordinator", null);

    public C4666u(C14459O c14459o, C13969n2 c13969n2, C4668w c4668w, C17236j c17236j) {
        this.f15195a = c14459o;
        this.f15196b = c13969n2;
        this.f15197c = c4668w;
        this.f15198d = c17236j;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m5374a(C4666u c4666u, C6617X c6617x, String str, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4662q c4662q;
        String lowerCase;
        Intent intent;
        c4666u.getClass();
        if (abstractC19687c instanceof C4662q) {
            c4662q = (C4662q) abstractC19687c;
            int i10 = c4662q.f15179q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4662q.f15179q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4662q = new C4662q(c4666u, abstractC19687c);
            }
        } else {
            c4662q = new C4662q(c4666u, abstractC19687c);
        }
        C4662q c4662q2 = c4662q;
        Object objM5375i = c4662q2.f15177o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4662q2.f15179q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4662q2.f15176Z;
                c4666u = c4662q2.f15175Y;
                AbstractC9233X.m9807c(objM5375i);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
            return objM5375i;
        }
        AbstractC9233X.m9807c(objM5375i);
        String str2 = (String) c6617x.f21344b.f20091a.f28484f.get("platform");
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        boolean zM18089b = AbstractC16544l.m18089b(lowerCase, "whatsapp");
        C9463v c9463v = c6617x.f21344b.f20091a;
        if (zM18089b) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + str + "&text=" + ((String) c9463v.f28484f.get("message"))));
        } else {
            intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", (String) c9463v.f28484f.get("message"));
        }
        c4662q2.f15175Y = c4666u;
        c4662q2.f15176Z = c6617x;
        c4662q2.f15179q0 = 1;
        c4653h.invoke(intent, c4662q2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        C4666u c4666u2 = c4666u;
        if (!((Boolean) objM5375i).booleanValue()) {
            return null;
        }
        c4662q2.f15175Y = null;
        c4662q2.f15176Z = null;
        c4662q2.f15179q0 = 2;
        objM5375i = m5375i(c4666u2, c6617x, "Message sent", 0, c4662q2, 12);
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        return objM5375i;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m5375i(C4666u c4666u, C6617X c6617x, String str, int i10, AbstractC19687c abstractC19687c, int i11) {
        if ((i11 & 4) != 0) {
            i10 = RCHTTPStatusCodes.SUCCESS;
        }
        return c4666u.m5383h(c6617x, str, i10, null, abstractC19687c);
    }

    /* JADX INFO: renamed from: p */
    public static long m5376p(String str) {
        C5521B c5521bM5949a = C5556z.m5949a(C5521B.Companion, str);
        C5525F.Companion.getClass();
        Instant instant = c5521bM5949a.f17975Y.mo16845n(C5524E.m5924a().f17977a).toInstant();
        new C5551u(instant);
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m5377b(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4647b c4647b;
        C4666u c4666u;
        if (abstractC19687c instanceof C4647b) {
            c4647b = (C4647b) abstractC19687c;
            int i10 = c4647b.f15113q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4647b.f15113q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4647b = new C4647b(this, abstractC19687c);
            }
        } else {
            c4647b = new C4647b(this, abstractC19687c);
        }
        C4647b c4647b2 = c4647b;
        Object objM5375i = c4647b2.f15111o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4647b2.f15113q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4647b2.f15110Z;
                C4666u c4666u2 = c4647b2.f15109Y;
                AbstractC9233X.m9807c(objM5375i);
                c4666u = c4666u2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(Uri.parse("content://com.android.calendar/events"));
        intent.putExtra(UiComponentConfig.Title.type, (String) c6617x.f21344b.f20091a.f28484f.get(UiComponentConfig.Title.type));
        C9463v c9463v = c6617x.f21344b.f20091a;
        String str = (String) c9463v.f28484f.get("startDateTime");
        intent.putExtra("beginTime", str != null ? new Long(m5376p(str)) : null);
        String str2 = (String) c9463v.f28484f.get("endDateTime");
        intent.putExtra("endTime", str2 != null ? new Long(m5376p(str2)) : null);
        c4647b2.f15109Y = this;
        c4647b2.f15110Z = c6617x;
        c4647b2.f15113q0 = 1;
        c4653h.invoke(intent, c4647b2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        if (!((Boolean) objM5375i).booleanValue()) {
            return null;
        }
        c4647b2.f15109Y = null;
        c4647b2.f15110Z = null;
        c4647b2.f15113q0 = 2;
        objM5375i = m5375i(c4666u, c6617x, "Event added", 0, c4647b2, 12);
        return objM5375i == enumC19250a ? enumC19250a : objM5375i;
    }

    /* JADX INFO: renamed from: c */
    public final C2180g m5378c() {
        return AbstractC2124C.m3216o(new C1970n(AbstractC9206S2.m9771b(new C4649d(2, null), this.f15195a.f45526y), 12, this), C4650e.f15118Y, AbstractC2124C.f6495b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m5379d(C6617X c6617x, AbstractC19687c abstractC19687c) throws Exception {
        C4651f c4651f;
        C4666u c4666u;
        C7351f0 c7351f0;
        if (abstractC19687c instanceof C4651f) {
            c4651f = (C4651f) abstractC19687c;
            int i10 = c4651f.f15123q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4651f.f15123q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4651f = new C4651f(this, abstractC19687c);
            }
        } else {
            c4651f = new C4651f(this, abstractC19687c);
        }
        C4651f c4651f2 = c4651f;
        Object objM5392b = c4651f2.f15121o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4651f2.f15123q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM5392b);
            c4651f2.f15119Y = this;
            c4651f2.f15120Z = c6617x;
            c4651f2.f15123q0 = 1;
            objM5392b = this.f15197c.m5392b(c4651f2);
            if (objM5392b == enumC19250a) {
                return enumC19250a;
            }
            c4666u = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC9233X.m9807c(objM5392b);
                        c7351f0 = (C7351f0) objM5392b;
                        return c7351f0;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC9233X.m9807c(objM5392b);
                return (C7351f0) objM5392b;
            }
            c6617x = c4651f2.f15120Z;
            c4666u = c4651f2.f15119Y;
            AbstractC9233X.m9807c(objM5392b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM5392b;
        c7351f0 = null;
        if (abstractC21955Q1 instanceof C21952P1) {
            C4671z c4671z = (C4671z) ((C21952P1) abstractC21955Q1).f69511a;
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            String strM12905d = c11527o.m12905d(AbstractC9961r4.m10615b(C4671z.Companion.serializer()), c4671z);
            c4651f2.f15119Y = null;
            c4651f2.f15120Z = null;
            c4651f2.f15123q0 = 2;
            objM5392b = m5375i(c4666u, c6617x, strM12905d, 0, c4651f2, 12);
            if (objM5392b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                Throwable th2 = ((AbstractC21933K1) abstractC21955Q1).f69485a;
                if (th2 instanceof C4642A) {
                    AbstractC8160o6.m8731f(c4666u.f15200f, AbstractC10763a.m11054l("Permission ", ((C4642A) th2).f15104Y, " not yet granted"), null, null, 6);
                } else {
                    c4651f2.f15119Y = null;
                    c4651f2.f15120Z = null;
                    c4651f2.f15123q0 = 3;
                    objM5392b = m5375i(c4666u, c6617x, "Location unavailable", 404, c4651f2, 8);
                    if (objM5392b == enumC19250a) {
                        return enumC19250a;
                    }
                    c7351f0 = (C7351f0) objM5392b;
                }
                return c7351f0;
            }
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            C11527o c11527o2 = AbstractC18201b.f58034a;
            c11527o2.getClass();
            String strM12905d2 = c11527o2.m12905d(AbstractC9961r4.m10615b(C4671z.Companion.serializer()), null);
            c4651f2.f15119Y = null;
            c4651f2.f15120Z = null;
            c4651f2.f15123q0 = 4;
            objM5392b = m5375i(c4666u, c6617x, strM12905d2, 0, c4651f2, 12);
            if (objM5392b == enumC19250a) {
                return enumC19250a;
            }
        }
        return (C7351f0) objM5392b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final Object m5380e(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4652g c4652g;
        C6617X c6617x2;
        InterfaceC1439n interfaceC1439n;
        C4666u c4666u;
        C6617X c6617x3;
        C4666u c4666u2;
        VoiceInteractionSession.AssistState assistStateM4847h;
        AssistStructure assistStructure;
        AssistStructure assistStructure2;
        C17232f c17232f;
        Object objM5375i;
        ArrayList arrayList;
        C3507f it;
        ArrayList arrayList2;
        if (abstractC19687c instanceof C4652g) {
            c4652g = (C4652g) abstractC19687c;
            int i10 = c4652g.f15129r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4652g.f15129r0 = i10 - Integer.MIN_VALUE;
            } else {
                c4652g = new C4652g(this, abstractC19687c);
            }
        } else {
            c4652g = new C4652g(this, abstractC19687c);
        }
        C4652g c4652g2 = c4652g;
        Object objM3223v = c4652g2.f15127p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4652g2.f15129r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3223v);
            C17236j c17236j = this.f15198d;
            c4652g2.f15124Y = this;
            c6617x2 = c6617x;
            c4652g2.f15125Z = c6617x2;
            interfaceC1439n = c4653h;
            c4652g2.f15126o0 = interfaceC1439n;
            c4652g2.f15129r0 = 1;
            objM3223v = AbstractC2124C.m3223v(c17236j.f54992a, c4652g2);
            if (objM3223v == enumC19250a) {
                return enumC19250a;
            }
            c4666u = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC9233X.m9807c(objM3223v);
                    return null;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM3223v);
                    return objM3223v;
                }
                C6617X c6617x4 = c4652g2.f15125Z;
                C4666u c4666u3 = c4652g2.f15124Y;
                AbstractC9233X.m9807c(objM3223v);
                c6617x3 = c6617x4;
                c4666u2 = c4666u3;
                assistStateM4847h = AbstractC4181h.m4847h(objM3223v);
                C3430e c3430e = c4666u2.f15200f;
                if (assistStateM4847h != null) {
                    assistStructure = assistStateM4847h.getAssistStructure();
                } else {
                    assistStructure = null;
                }
                AbstractC8160o6.m8726a(c3430e, "AssistantInteractionSession onHandleAssist: " + assistStateM4847h + Separators.f31991SP + assistStructure, null, 6);
                if (assistStateM4847h != null) {
                    assistStructure2 = assistStateM4847h.getAssistStructure();
                } else {
                    assistStructure2 = null;
                }
                if (assistStructure2 != null) {
                    C3508g c3508gM8929t = AbstractC8301I.m8929t(0, assistStructure2.getWindowNodeCount());
                    arrayList = new ArrayList();
                    it = c3508gM8929t.iterator();
                    while (it.f10596o0) {
                        AssistStructure.WindowNode windowNodeAt = assistStructure2.getWindowNodeAt(it.mo4199a());
                        AbstractC16544l.m18091d(windowNodeAt);
                        arrayList2 = new ArrayList();
                        AssistStructure.ViewNode rootViewNode = windowNodeAt.getRootViewNode();
                        AbstractC16544l.m18093f(rootViewNode, "getRootViewNode(...)");
                        AbstractC17237k.m18965a(rootViewNode, arrayList2, 0, 0);
                        if (arrayList2.size() > 1) {
                            AbstractC17685s.m19392u(arrayList2, new C0842z(17));
                        }
                        arrayList.add(new C17235i(windowNodeAt.getTitle().toString(), arrayList2));
                    }
                    c17232f = new C17232f(arrayList);
                } else {
                    c17232f = null;
                }
                C11527o c11527o = AbstractC18201b.f58034a;
                c11527o.getClass();
                String strM12905d = c11527o.m12905d(AbstractC9961r4.m10615b(C17232f.Companion.serializer()), c17232f);
                AbstractC8160o6.m8731f(c4666u2.f15200f, "DeviceContext: Screen: " + strM12905d + Separators.f31991SP + c6617x3, null, null, 6);
                c4652g2.f15124Y = null;
                c4652g2.f15125Z = null;
                c4652g2.f15129r0 = 4;
                objM5375i = m5375i(c4666u2, c6617x3, strM12905d, 0, c4652g2, 12);
                if (objM5375i == enumC19250a) {
                    return enumC19250a;
                }
                return objM5375i;
            }
            InterfaceC1439n interfaceC1439n2 = c4652g2.f15126o0;
            C6617X c6617x5 = c4652g2.f15125Z;
            c4666u = c4652g2.f15124Y;
            AbstractC9233X.m9807c(objM3223v);
            interfaceC1439n = interfaceC1439n2;
            c6617x2 = c6617x5;
        }
        if (objM3223v == null) {
            Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
            c4652g2.f15124Y = null;
            c4652g2.f15125Z = null;
            c4652g2.f15126o0 = null;
            c4652g2.f15129r0 = 2;
            if (interfaceC1439n.invoke(intent, c4652g2) == enumC19250a) {
                return enumC19250a;
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            C17236j c17236j2 = c4666u.f15198d;
            c4652g2.f15124Y = c4666u;
            c4652g2.f15125Z = c6617x2;
            c4652g2.f15126o0 = null;
            c4652g2.f15129r0 = 3;
            objM3223v = AbstractC2124C.m3223v(c17236j2.f54992a, c4652g2);
            if (objM3223v == enumC19250a) {
                return enumC19250a;
            }
            c6617x3 = c6617x2;
            c4666u2 = c4666u;
            assistStateM4847h = AbstractC4181h.m4847h(objM3223v);
            C3430e c3430e2 = c4666u2.f15200f;
            if (assistStateM4847h != null) {
                assistStructure = assistStateM4847h.getAssistStructure();
            } else {
                assistStructure = null;
            }
            AbstractC8160o6.m8726a(c3430e2, "AssistantInteractionSession onHandleAssist: " + assistStateM4847h + Separators.f31991SP + assistStructure, null, 6);
            if (assistStateM4847h != null) {
                assistStructure2 = assistStateM4847h.getAssistStructure();
            } else {
                assistStructure2 = null;
            }
            if (assistStructure2 != null) {
                C3508g c3508gM8929t2 = AbstractC8301I.m8929t(0, assistStructure2.getWindowNodeCount());
                arrayList = new ArrayList();
                it = c3508gM8929t2.iterator();
                while (it.f10596o0) {
                    AssistStructure.WindowNode windowNodeAt2 = assistStructure2.getWindowNodeAt(it.mo4199a());
                    AbstractC16544l.m18091d(windowNodeAt2);
                    arrayList2 = new ArrayList();
                    AssistStructure.ViewNode rootViewNode2 = windowNodeAt2.getRootViewNode();
                    AbstractC16544l.m18093f(rootViewNode2, "getRootViewNode(...)");
                    AbstractC17237k.m18965a(rootViewNode2, arrayList2, 0, 0);
                    if (arrayList2.size() > 1) {
                        AbstractC17685s.m19392u(arrayList2, new C0842z(17));
                    }
                    arrayList.add(new C17235i(windowNodeAt2.getTitle().toString(), arrayList2));
                }
                c17232f = new C17232f(arrayList);
            } else {
                c17232f = null;
            }
            C11527o c11527o2 = AbstractC18201b.f58034a;
            c11527o2.getClass();
            String strM12905d2 = c11527o2.m12905d(AbstractC9961r4.m10615b(C17232f.Companion.serializer()), c17232f);
            AbstractC8160o6.m8731f(c4666u2.f15200f, "DeviceContext: Screen: " + strM12905d2 + Separators.f31991SP + c6617x3, null, null, 6);
            c4652g2.f15124Y = null;
            c4652g2.f15125Z = null;
            c4652g2.f15129r0 = 4;
            objM5375i = m5375i(c4666u2, c6617x3, strM12905d2, 0, c4652g2, 12);
            if (objM5375i == enumC19250a) {
                return enumC19250a;
            }
            return objM5375i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: f */
    public final Object m5381f(C6617X c6617x, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        long jM21835e;
        C7351f0 c7351f0;
        C7351f0 c7351f1;
        C9463v c9463v;
        C7351f0 c7351f2 = null;
        C4653h c4653h = new C4653h(this, interfaceC1436k, c6617x, null);
        if (((c6617x == null || (c9463v = c6617x.f21344b.f20091a) == null) ? null : c9463v.f28482d) == null) {
            if (c6617x != null) {
                Object objM5375i = m5375i(this, c6617x, "Unsupported Operation", RCHTTPStatusCodes.BAD_REQUEST, abstractC19687c, 8);
                if (objM5375i == EnumC19250a.f61036Y) {
                    return objM5375i;
                }
                c7351f2 = (C7351f0) objM5375i;
            }
            return c7351f2;
        }
        C7102a c7102a = EnumC6173e.f20099o0;
        String str = c6617x.f21344b.f20091a.f28482d;
        c7102a.getClass();
        EnumC6173e enumC6173eM7512r = C7102a.m7512r(str);
        int i10 = enumC6173eM7512r == null ? -1 : AbstractC4646a.f15108a[enumC6173eM7512r.ordinal()];
        C9463v c9463v2 = c6617x.f21344b.f20091a;
        switch (i10) {
            case -1:
                Object objM5375i2 = m5375i(this, c6617x, "Unsupported Operation", RCHTTPStatusCodes.BAD_REQUEST, abstractC19687c, 8);
                return objM5375i2 == EnumC19250a.f61036Y ? objM5375i2 : (C7351f0) objM5375i2;
            case 0:
            default:
                throw new C0644w();
            case 1:
                String str2 = (String) c9463v2.f28484f.get("startTime");
                long jM5376p = str2 != null ? m5376p(str2) : 0L;
                String str3 = (String) c9463v2.f28484f.get("endTime");
                if (str3 != null) {
                    jM21835e = m5376p(str3);
                } else {
                    C21554a c21554a = C21555b.f68260Z;
                    jM21835e = C21555b.m21835e(AbstractC8128k6.m8644j(24, EnumC21557d.HOURS));
                }
                C4668w c4668w = this.f15197c;
                AbstractC21955Q1 abstractC21955Q1M5391a = c4668w.m5391a("android.permission.READ_CALENDAR");
                if (abstractC21955Q1M5391a == null) {
                    JSONArray jSONArray = new JSONArray();
                    ContentResolver contentResolver = c4668w.f15206a.getContentResolver();
                    String[] strArr = {"_id", UiComponentConfig.Title.type, "dtstart", "dtend", "eventLocation", "description"};
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add("dtstart >= ?");
                    arrayList2.add(String.valueOf(System.currentTimeMillis() + jM5376p));
                    arrayList.add("dtend <= ?");
                    arrayList2.add(String.valueOf(System.currentTimeMillis() + jM21835e));
                    Cursor cursorQuery = contentResolver.query(CalendarContract.Events.CONTENT_URI, strArr, AbstractC17680n.m19349Y(arrayList, " AND ", null, null, 0, null, null, 62), (String[]) arrayList2.toArray(new String[0]), null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex(UiComponentConfig.Title.type));
                                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex("dtstart"));
                                long j12 = cursorQuery.getLong(cursorQuery.getColumnIndex("dtend"));
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("eventLocation"));
                                String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("description"));
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(ParameterNames.f31999ID, j10);
                                jSONObject.put(UiComponentConfig.Title.type, string);
                                jSONObject.put("startDateTime", j11);
                                jSONObject.put("endDateTime", j12);
                                jSONObject.put("location", string2);
                                jSONObject.put("description", string3);
                                jSONArray.put(jSONObject);
                                c7351f2 = null;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC7942M5.m8232a(cursorQuery, th2);
                                    throw th3;
                                }
                            }
                        }
                        AbstractC7942M5.m8232a(cursorQuery, c7351f2);
                    }
                    String string4 = jSONArray.toString();
                    AbstractC16544l.m18093f(string4, "toString(...)");
                    abstractC21955Q1M5391a = new C21952P1(string4);
                }
                if (abstractC21955Q1M5391a instanceof C21952P1) {
                    String str4 = (String) ((C21952P1) abstractC21955Q1M5391a).f69511a;
                    if (str4 != null) {
                        Object objM5375i3 = m5375i(this, c6617x, str4, 0, abstractC19687c, 12);
                        if (objM5375i3 == EnumC19250a.f61036Y) {
                            return objM5375i3;
                        }
                        c7351f1 = (C7351f0) objM5375i3;
                    } else {
                        c7351f1 = null;
                    }
                } else {
                    if (abstractC21955Q1M5391a instanceof AbstractC21933K1) {
                        Throwable th4 = ((AbstractC21933K1) abstractC21955Q1M5391a).f69485a;
                        if (th4 instanceof C4642A) {
                            c7351f0 = null;
                            AbstractC8160o6.m8731f(this.f15200f, AbstractC10763a.m11054l("Permission ", ((C4642A) th4).f15104Y, " not granted"), null, null, 6);
                        } else {
                            c7351f0 = null;
                        }
                    } else {
                        c7351f0 = null;
                        if (!(abstractC21955Q1M5391a instanceof C21929J1)) {
                            throw new C0644w();
                        }
                    }
                    c7351f1 = c7351f0;
                }
                return c7351f1;
            case 2:
                return m5379d(c6617x, abstractC19687c);
            case 3:
                String str5 = (String) c9463v2.f28484f.get("contact");
                return m5390q(c6617x, str5 != null ? str5 : "", new C4661p(c4653h, this, c6617x, null), abstractC19687c);
            case 4:
                String str6 = (String) c9463v2.f28484f.get("contact");
                return m5390q(c6617x, str6 != null ? str6 : "", new C4656k(c4653h, this, c6617x, null), abstractC19687c);
            case 5:
                return m5389o(c6617x, c4653h, abstractC19687c);
            case 6:
                return m5382g(c6617x, c4653h, abstractC19687c);
            case 7:
                return m5385k(c6617x, c4653h, abstractC19687c);
            case 8:
                return m5387m(c6617x, c4653h, abstractC19687c);
            case 9:
                return m5384j(c6617x, c4653h, abstractC19687c);
            case 10:
                return m5388n(c6617x, c4653h, abstractC19687c);
            case 11:
                return m5377b(c6617x, c4653h, abstractC19687c);
            case 12:
                return m5380e(c6617x, c4653h, abstractC19687c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m5382g(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4655j c4655j;
        C4666u c4666u;
        if (abstractC19687c instanceof C4655j) {
            c4655j = (C4655j) abstractC19687c;
            int i10 = c4655j.f15142q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4655j.f15142q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4655j = new C4655j(this, abstractC19687c);
            }
        } else {
            c4655j = new C4655j(this, abstractC19687c);
        }
        C4655j c4655j2 = c4655j;
        Object objM5375i = c4655j2.f15140o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4655j2.f15142q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4655j2.f15139Z;
                C4666u c4666u2 = c4655j2.f15138Y;
                AbstractC9233X.m9807c(objM5375i);
                c4666u = c4666u2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
            return objM5375i;
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("geo:0,0?q=" + ((String) c6617x.f21344b.f20091a.f28484f.get("query"))));
        c4655j2.f15138Y = this;
        c4655j2.f15139Z = c6617x;
        c4655j2.f15142q0 = 1;
        c4653h.invoke(intent, c4655j2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        boolean zBooleanValue = ((Boolean) objM5375i).booleanValue();
        objM5375i = null;
        if (zBooleanValue) {
            c4655j2.f15138Y = null;
            c4655j2.f15139Z = null;
            c4655j2.f15142q0 = 2;
            objM5375i = m5375i(c4666u, c6617x, "Map launched", 0, c4655j2, 12);
            if (objM5375i == enumC19250a) {
                return enumC19250a;
            }
        }
        return objM5375i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: h */
    public final Object m5383h(C6617X c6617x, String str, int i10, String str2, AbstractC19687c abstractC19687c) {
        C4657l c4657l;
        int i11;
        C6617X c6617x2;
        String str3;
        String str4 = str;
        if (abstractC19687c instanceof C4657l) {
            c4657l = (C4657l) abstractC19687c;
            int i12 = c4657l.f15154s0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c4657l.f15154s0 = i12 - Integer.MIN_VALUE;
            } else {
                c4657l = new C4657l(this, abstractC19687c);
            }
        } else {
            c4657l = new C4657l(this, abstractC19687c);
        }
        Object objM3221t = c4657l.f15152q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i13 = c4657l.f15154s0;
        if (i13 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            AbstractC8160o6.m8726a(this.f15200f, "making reply " + str4, null, 6);
            C14459O c14459o = this.f15195a;
            c4657l.f15148Y = c6617x;
            c4657l.f15149Z = str4;
            c4657l.f15150o0 = str2;
            i11 = i10;
            c4657l.f15151p0 = i11;
            c4657l.f15154s0 = 1;
            objM3221t = AbstractC2124C.m3221t(c14459o.f45521t, c4657l);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            c6617x2 = c6617x;
            str3 = str2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = c4657l.f15151p0;
            str3 = c4657l.f15150o0;
            String str5 = c4657l.f15149Z;
            c6617x2 = c4657l.f15148Y;
            AbstractC9233X.m9807c(objM3221t);
            i11 = i14;
            str4 = str5;
        }
        C6636i c6636i = (C6636i) objM3221t;
        if (c6636i == null) {
            return null;
        }
        String strName = c6617x2.f21344b.f20093c.name();
        C6172d c6172d = c6617x2.f21344b;
        String conversationId = c6636i.f21379a;
        AbstractC16544l.m18094g(conversationId, "conversationId");
        C21984a1.Companion.getClass();
        String strM22340b = C21980Z0.m22340b();
        if (str4 == null) {
            str4 = "";
        }
        C7326L c7326l = new C7326L(str4);
        C22020j1.Companion.getClass();
        EnumC7359j0 enumC7359j0 = EnumC7359j0.f23349t0;
        EnumC7355h0 enumC7355h0 = EnumC7355h0.f23320Z;
        C9433B c9433b = new C9433B(strName, null, null);
        String str6 = c6172d.f20092b;
        return new C7351f0(strM22340b, null, conversationId, null, enumC7359j0, c7326l, "gpt-4o-mini", enumC7355h0, str6, null, null, null, null, new C9440I(c9433b, new C1193x2(Integer.valueOf(i11), str6 != null ? (String) AbstractC17680n.m19343S(AbstractC21322p.m21697e0(str6, new String[]{Separators.DOT}, 0, 6)) : null), str3, 1935), "gpt-4o-mini", false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, -49654, 511);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m5384j(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4658m c4658m;
        C4666u c4666u;
        C6617X c6617x2;
        if (abstractC19687c instanceof C4658m) {
            c4658m = (C4658m) abstractC19687c;
            int i10 = c4658m.f15159q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4658m.f15159q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4658m = new C4658m(this, abstractC19687c);
            }
        } else {
            c4658m = new C4658m(this, abstractC19687c);
        }
        C4658m c4658m2 = c4658m;
        Object objM5375i = c4658m2.f15157o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4658m2.f15159q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM5375i);
            String str = (String) c6617x.f21344b.f20091a.f28484f.get("packageName");
            if (str == null) {
                str = "";
            }
            Object launchIntentForPackage = this.f15197c.f15206a.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                c4658m2.f15159q0 = 3;
                objM5375i = m5375i(this, c6617x, "App not found", 404, c4658m2, 8);
                return objM5375i == enumC19250a ? enumC19250a : objM5375i;
            }
            c4658m2.f15155Y = this;
            c4658m2.f15156Z = c6617x;
            c4658m2.f15159q0 = 1;
            c4653h.invoke(launchIntentForPackage, c4658m2);
            if (Boolean.TRUE == enumC19250a) {
                return enumC19250a;
            }
            c4666u = this;
            c6617x2 = c6617x;
            c4658m2.f15155Y = null;
            c4658m2.f15156Z = null;
            c4658m2.f15159q0 = 2;
            objM5375i = m5375i(c4666u, c6617x2, "App opened", 0, c4658m2, 12);
            if (objM5375i == enumC19250a) {
                return enumC19250a;
            }
        } else if (i11 == 1) {
            C6617X c6617x3 = c4658m2.f15156Z;
            C4666u c4666u2 = c4658m2.f15155Y;
            AbstractC9233X.m9807c(objM5375i);
            c6617x2 = c6617x3;
            c4666u = c4666u2;
            c4658m2.f15155Y = null;
            c4658m2.f15156Z = null;
            c4658m2.f15159q0 = 2;
            objM5375i = m5375i(c4666u, c6617x2, "App opened", 0, c4658m2, 12);
            if (objM5375i == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    AbstractC9233X.m9807c(objM5375i);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM5375i);
        }
        return objM5375i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: k */
    public final Object m5385k(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4659n c4659n;
        C4666u c4666u;
        C6617X c6617x2 = c6617x;
        if (abstractC19687c instanceof C4659n) {
            c4659n = (C4659n) abstractC19687c;
            int i10 = c4659n.f15164q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4659n.f15164q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4659n = new C4659n(this, abstractC19687c);
            }
        } else {
            c4659n = new C4659n(this, abstractC19687c);
        }
        C4659n c4659n2 = c4659n;
        Object objM5375i = c4659n2.f15162o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4659n2.f15164q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x2 = c4659n2.f15161Z;
                c4666u = c4659n2.f15160Y;
                AbstractC9233X.m9807c(objM5375i);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH");
        intent.putExtra("query", AbstractC17680n.m19349Y(c6617x2.f21344b.f20091a.f28484f.values(), Separators.f31991SP, null, null, 0, null, null, 62));
        intent.putExtra("android.intent.extra.focus", "vnd.android.cursor.item/*");
        c4659n2.f15160Y = this;
        c4659n2.f15161Z = c6617x2;
        c4659n2.f15164q0 = 1;
        c4653h.invoke(intent, c4659n2);
        if (Boolean.TRUE == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        c4659n2.f15160Y = null;
        c4659n2.f15161Z = null;
        c4659n2.f15164q0 = 2;
        objM5375i = m5375i(c4666u, c6617x2, "Attempting to play music", 0, c4659n2, 12);
        return objM5375i == enumC19250a ? enumC19250a : objM5375i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m5386l(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C4660o c4660o;
        C4666u c4666u;
        if (abstractC19687c instanceof C4660o) {
            c4660o = (C4660o) abstractC19687c;
            int i10 = c4660o.f15169q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4660o.f15169q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4660o = new C4660o(this, abstractC19687c);
            }
        } else {
            c4660o = new C4660o(this, abstractC19687c);
        }
        Object objM3223v = c4660o.f15167o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4660o.f15169q0;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC1436k = c4660o.f15166Z;
                c4666u = c4660o.f15165Y;
                AbstractC9233X.m9807c(objM3223v);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3223v);
            }
            return (C7351f0) objM3223v;
        }
        AbstractC9233X.m9807c(objM3223v);
        AbstractC8160o6.m8728c(this.f15200f, "Rechecking permission and rerunning client actions", null, null, 6);
        C2180g c2180gM5378c = m5378c();
        c4660o.f15165Y = this;
        c4660o.f15166Z = interfaceC1436k;
        c4660o.f15169q0 = 1;
        objM3223v = AbstractC2124C.m3223v(c2180gM5378c, c4660o);
        if (objM3223v == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        C17309l c17309l = (C17309l) objM3223v;
        if (c17309l == null) {
            return null;
        }
        C6617X c6617x = (C6617X) c17309l.f55136Y;
        c4660o.f15165Y = null;
        c4660o.f15166Z = null;
        c4660o.f15169q0 = 2;
        objM3223v = c4666u.m5381f(c6617x, interfaceC1436k, c4660o);
        if (objM3223v == enumC19250a) {
            return enumC19250a;
        }
        return (C7351f0) objM3223v;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m5387m(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4663r c4663r;
        C4666u c4666u;
        if (abstractC19687c instanceof C4663r) {
            c4663r = (C4663r) abstractC19687c;
            int i10 = c4663r.f15184q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4663r.f15184q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4663r = new C4663r(this, abstractC19687c);
            }
        } else {
            c4663r = new C4663r(this, abstractC19687c);
        }
        C4663r c4663r2 = c4663r;
        Object objM5375i = c4663r2.f15182o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4663r2.f15184q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4663r2.f15181Z;
                C4666u c4666u2 = c4663r2.f15180Y;
                AbstractC9233X.m9807c(objM5375i);
                c4666u = c4666u2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.intent.action.SET_ALARM");
        String str = (String) c6617x.f21344b.f20091a.f28484f.get("hour");
        intent.putExtra("android.intent.extra.alarm.HOUR", str != null ? new Integer(Integer.parseInt(str)) : null);
        String str2 = (String) c6617x.f21344b.f20091a.f28484f.get("minutes");
        intent.putExtra("android.intent.extra.alarm.MINUTES", str2 != null ? new Integer(Integer.parseInt(str2)) : null);
        c4663r2.f15180Y = this;
        c4663r2.f15181Z = c6617x;
        c4663r2.f15184q0 = 1;
        c4653h.invoke(intent, c4663r2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        if (!((Boolean) objM5375i).booleanValue()) {
            return null;
        }
        c4663r2.f15180Y = null;
        c4663r2.f15181Z = null;
        c4663r2.f15184q0 = 2;
        objM5375i = m5375i(c4666u, c6617x, "Alarm set", 0, c4663r2, 12);
        return objM5375i == enumC19250a ? enumC19250a : objM5375i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m5388n(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4664s c4664s;
        C4666u c4666u;
        if (abstractC19687c instanceof C4664s) {
            c4664s = (C4664s) abstractC19687c;
            int i10 = c4664s.f15189q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4664s.f15189q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4664s = new C4664s(this, abstractC19687c);
            }
        } else {
            c4664s = new C4664s(this, abstractC19687c);
        }
        C4664s c4664s2 = c4664s;
        Object objM5375i = c4664s2.f15187o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4664s2.f15189q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4664s2.f15186Z;
                C4666u c4666u2 = c4664s2.f15185Y;
                AbstractC9233X.m9807c(objM5375i);
                c4666u = c4666u2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.intent.action.SET_TIMER");
        String str = (String) c6617x.f21344b.f20091a.f28484f.get("length");
        intent.putExtra("android.intent.extra.alarm.LENGTH", str != null ? new Integer(Integer.parseInt(str)) : null);
        c4664s2.f15185Y = this;
        c4664s2.f15186Z = c6617x;
        c4664s2.f15189q0 = 1;
        c4653h.invoke(intent, c4664s2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        if (!((Boolean) objM5375i).booleanValue()) {
            return null;
        }
        c4664s2.f15185Y = null;
        c4664s2.f15186Z = null;
        c4664s2.f15189q0 = 2;
        objM5375i = m5375i(c4666u, c6617x, "Timer set", 0, c4664s2, 12);
        return objM5375i == enumC19250a ? enumC19250a : objM5375i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m5389o(C6617X c6617x, C4653h c4653h, AbstractC19687c abstractC19687c) {
        C4665t c4665t;
        C4666u c4666u;
        if (abstractC19687c instanceof C4665t) {
            c4665t = (C4665t) abstractC19687c;
            int i10 = c4665t.f15194q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4665t.f15194q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4665t = new C4665t(this, abstractC19687c);
            }
        } else {
            c4665t = new C4665t(this, abstractC19687c);
        }
        C4665t c4665t2 = c4665t;
        Object objM5375i = c4665t2.f15192o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4665t2.f15194q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6617x = c4665t2.f15191Z;
                C4666u c4666u2 = c4665t2.f15190Y;
                AbstractC9233X.m9807c(objM5375i);
                c4666u = c4666u2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM5375i);
            }
            return objM5375i;
        }
        AbstractC9233X.m9807c(objM5375i);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("google.navigation:q=" + c6617x.f21344b.f20091a.f28484f.get("destination")));
        c4665t2.f15190Y = this;
        c4665t2.f15191Z = c6617x;
        c4665t2.f15194q0 = 1;
        c4653h.invoke(intent, c4665t2);
        objM5375i = Boolean.TRUE;
        if (objM5375i == enumC19250a) {
            return enumC19250a;
        }
        c4666u = this;
        boolean zBooleanValue = ((Boolean) objM5375i).booleanValue();
        objM5375i = null;
        if (zBooleanValue) {
            c4665t2.f15190Y = null;
            c4665t2.f15191Z = null;
            c4665t2.f15194q0 = 2;
            objM5375i = m5375i(c4666u, c6617x, "Navigation started", 0, c4665t2, 12);
            if (objM5375i == enumC19250a) {
                return enumC19250a;
            }
        }
        return objM5375i;
    }

    /* JADX INFO: renamed from: q */
    public final Object m5390q(C6617X c6617x, String str, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        List list;
        if (Patterns.PHONE.matcher(str).matches()) {
            return interfaceC1439n.invoke(str, abstractC19687c);
        }
        C4668w c4668w = this.f15197c;
        AbstractC21955Q1 abstractC21955Q1M5391a = c4668w.m5391a("android.permission.READ_CONTACTS");
        if (abstractC21955Q1M5391a == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Application application = c4668w.f15206a;
            Cursor cursorQuery = application.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, MMVKXkcLpuHFDi.zenkooeP, new String[]{AbstractC10763a.m11054l(Separators.PERCENT, str, Separators.PERCENT)}, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String number = PhoneNumberUtils.formatNumber(cursorQuery.getString(cursorQuery.getColumnIndex("data1")), AbstractC8012V5.m8334g(application).getCountry());
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                        AbstractC16544l.m18091d(string);
                        AbstractC16544l.m18091d(number);
                        linkedHashSet.add(new C4645D(string, number));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                AbstractC7942M5.m8232a(cursorQuery, null);
            }
            abstractC21955Q1M5391a = new C21952P1(AbstractC17680n.m19322C0(linkedHashSet));
        }
        if (abstractC21955Q1M5391a instanceof C21952P1) {
            list = (List) ((C21952P1) abstractC21955Q1M5391a).f69511a;
        } else {
            if (abstractC21955Q1M5391a instanceof AbstractC21933K1) {
            } else if (!(abstractC21955Q1M5391a instanceof C21929J1)) {
                throw new C0644w();
            }
            list = null;
        }
        Integer num = list != null ? new Integer(list.size()) : null;
        if (num == null) {
            AbstractC8160o6.m8728c(this.f15200f, "Need to prompt user for permission", null, null, 6);
            return null;
        }
        if (num.intValue() == 0) {
            return m5375i(this, c6617x, "Contact not found", 404, abstractC19687c, 8);
        }
        if (num.intValue() == 1) {
            return interfaceC1439n.invoke(((C4645D) AbstractC17680n.m19341Q(list)).f15107b, abstractC19687c);
        }
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        return m5375i(this, c6617x, "Multiple contacts found: ".concat(c11527o.m12905d(new C11158d(C4645D.Companion.serializer(), 0), list)), HttpStatusCode.CONFLICT_409, abstractC19687c, 8);
    }
}
