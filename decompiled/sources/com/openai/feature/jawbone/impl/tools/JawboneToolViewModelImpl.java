package com.openai.feature.jawbone.impl.tools;

import ai.AbstractC10620k;
import ai.C10619j;
import ai.EnumC10612c;
import android.app.Application;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import com.openai.chatgpt.R;
import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13969n2;
import gd.C13970o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p092Dc.C1991h;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1081wc.C20869O;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21913F1;
import p1155zi.C21921H1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p324Mn.AbstractC5546p;
import p324Mn.AbstractC5555y;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5531a;
import p324Mn.C5541k;
import p324Mn.C5551u;
import p324Mn.C5554x;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8519M3;
import p544W9.AbstractC8615c4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p817j$.time.DateTimeException;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;
import p817j$.time.format.TextStyle;
import p817j$.time.temporal.ChronoUnit;
import p854kf.AbstractC16393k;
import p854kf.AbstractC16394l;
import p854kf.C16390h;
import p854kf.EnumC16392j;
import p871lf.C16931o;
import p871lf.C16934r;
import p871lf.C16940x;
import p891mf.C17242c;
import p891mf.C17243d;
import p891mf.C17244e;
import p891mf.C17245f;
import p891mf.C17247h;
import p891mf.C17248i;
import p891mf.InterfaceC17246g;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/jawbone/impl/tools/JawboneToolViewModelImpl;", "Lcom/openai/feature/jawbone/tools/JawboneToolViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JawboneToolViewModelImpl extends JawboneToolViewModel {

    /* JADX INFO: renamed from: i */
    public final C16390h f38435i;

    /* JADX INFO: renamed from: j */
    public final Locale f38436j;

    /* JADX INFO: renamed from: k */
    public final C1991h f38437k;

    /* JADX INFO: renamed from: l */
    public final C5531a f38438l;

    /* JADX INFO: renamed from: m */
    public final Application f38439m;

    /* JADX INFO: renamed from: n */
    public final C13969n2 f38440n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC20904w f38441o;

    /* JADX INFO: renamed from: p */
    public final C3430e f38442p;

    /* JADX INFO: renamed from: com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lmf/h;", "Llf/x;", "jawbones", "invoke", "(Lmf/h;Llf/x;)Lmf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123861 extends AbstractC16546n implements InterfaceC1439n {
        public C123861() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:65:0x01b3  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Iterator it;
            C17247h c17247h;
            LinkedHashMap linkedHashMap;
            int i10;
            int i11;
            String strM3161c;
            String strM3161c2;
            String strM3161c3;
            int i12;
            C5551u c5551u;
            EnumC16392j enumC16392j;
            String strM3160b;
            int i13 = 1;
            C17247h setOnEach = (C17247h) obj;
            C16940x jawbones = (C16940x) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(jawbones, "jawbones");
            Map map = jawbones.f54388a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                C16931o c16931o = (C16931o) entry.getValue();
                String str = c16931o.f54371c;
                JawboneToolViewModelImpl jawboneToolViewModelImpl = JawboneToolViewModelImpl.this;
                Locale defaultLocale = jawboneToolViewModelImpl.f38436j;
                C3430e logger = jawboneToolViewModelImpl.f38442p;
                AbstractC16544l.m18094g(defaultLocale, "defaultLocale");
                C5531a clock = jawboneToolViewModelImpl.f38438l;
                AbstractC16544l.m18094g(clock, "clock");
                C1991h stringResolver = jawboneToolViewModelImpl.f38437k;
                AbstractC16544l.m18094g(stringResolver, "stringResolver");
                AbstractC16544l.m18094g(logger, "logger");
                List list = c16931o.f54380l;
                if (!list.isEmpty() || (c5551u = c16931o.f54379k) == null) {
                    int i14 = AbstractC10620k.f31511a;
                    C5551u c5551uM5929a = clock.m5929a();
                    C5524E c5524e = C5525F.Companion;
                    c5524e.getClass();
                    C5554x c5554xM5923a = AbstractC8519M3.m9187a(c5551uM5929a, C5524E.m5924a()).m5923a();
                    C10619j c10619j = c16931o.f54372d;
                    int i15 = AbstractC16394l.f50907a[c10619j.f31503a.ordinal()];
                    it = it2;
                    LocalDate localDate = c5554xM5923a.f18006Y;
                    Integer num = c10619j.f31508f;
                    switch (i15) {
                        case 1:
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            C5551u c5551u2 = c16931o.f54378j;
                            if (c5551u2 == null) {
                                i11 = 1;
                                strM3161c2 = null;
                            } else {
                                c5524e.getClass();
                                C5521B c5521bM9187a = AbstractC8519M3.m9187a(c5551u2, C5524E.m5924a());
                                C5554x c5554xM5923a2 = c5521bM9187a.m5923a();
                                String strM10989e = AbstractC10620k.m10989e(c5521bM9187a);
                                int i16 = AbstractC5555y.f18009c;
                                long jUntil = localDate.until(c5554xM5923a2.f18006Y, ChronoUnit.DAYS);
                                int i17 = jUntil > 2147483647L ? Integer.MAX_VALUE : jUntil < -2147483648L ? Integer.MIN_VALUE : (int) jUntil;
                                if (i17 != 0) {
                                    i10 = 1;
                                    if (i17 == 1) {
                                        strM3161c3 = stringResolver.m3161c(R.string.jawbone_one_time_tomorrow_format, strM10989e);
                                    } else if (2 <= i17 && i17 < 7) {
                                        strM3161c2 = stringResolver.m3161c(R.string.jawbone_one_time_this_week_format, AbstractC10620k.m10991g(c5521bM9187a, defaultLocale), strM10989e);
                                        i11 = 1;
                                    } else {
                                        if (7 > i17 || i17 >= 366) {
                                            i11 = 1;
                                            strM3161c = stringResolver.m3161c(R.string.jawbone_one_time_outside_this_year_format, AbstractC10620k.m10987c(c5521bM9187a), strM10989e);
                                        } else {
                                            i11 = 1;
                                            strM3161c = stringResolver.m3161c(R.string.jawbone_one_time_this_year_format, AbstractC10620k.m10986b(c5521bM9187a), strM10989e);
                                        }
                                        strM3161c2 = strM3161c;
                                    }
                                } else {
                                    i10 = 1;
                                    strM3161c3 = stringResolver.m3161c(R.string.jawbone_one_time_today_format, strM10989e);
                                }
                                strM3161c2 = strM3161c3;
                                i11 = i10;
                            }
                            break;
                        case 2:
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            C5521B c5521bM9267b = AbstractC8615c4.m9267b(c10619j, AbstractC10620k.m10992h(), logger);
                            if (c5521bM9267b != null) {
                                strM3161c2 = stringResolver.m3161c(R.string.jawbone_daily_runtime_format, AbstractC10620k.m10989e(c5521bM9267b));
                                i11 = 1;
                            } else {
                                i11 = 1;
                                strM3161c2 = null;
                            }
                            break;
                        case 3:
                            EnumC10612c enumC10612c = c10619j.f31507e;
                            if (enumC10612c != null) {
                                int iOrdinal = enumC10612c.ordinal();
                                DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                                AbstractC16544l.m18093f(dayOfWeek, "getDayOfWeek(...)");
                                int iOrdinal2 = iOrdinal - dayOfWeek.ordinal();
                                if (iOrdinal2 < 0) {
                                    iOrdinal2 += 7;
                                }
                                AbstractC5546p.Companion.getClass();
                                C5541k unit = AbstractC5546p.f17997a;
                                int i18 = AbstractC5555y.f18009c;
                                AbstractC16544l.m18094g(unit, "unit");
                                c17247h = setOnEach;
                                linkedHashMap = linkedHashMap2;
                                C5521B c5521bM9267b2 = AbstractC8615c4.m9267b(c10619j, AbstractC5555y.m5948a(c5554xM5923a, iOrdinal2, unit), logger);
                                if (c5521bM9267b2 != null) {
                                    i12 = 1;
                                    strM3161c2 = stringResolver.m3161c(R.string.jawbone_weekly_runtime_format, enumC10612c.f31493Z.getDisplayName(TextStyle.FULL, defaultLocale), AbstractC10620k.m10989e(c5521bM9267b2));
                                }
                                i11 = i12;
                            } else {
                                c17247h = setOnEach;
                                linkedHashMap = linkedHashMap2;
                            }
                            i12 = 1;
                            strM3161c2 = null;
                            i11 = i12;
                            break;
                        case 4:
                            if (num != null) {
                                strM3161c2 = Build.VERSION.SDK_INT >= 24 ? AbstractC16393k.m17983f(stringResolver.m3160b(R.string.jawbone_monthly_runtime_ordinal_format), defaultLocale).format(AbstractC17660E.m19258c(new C17309l("monthDay", num))) : stringResolver.m3161c(R.string.jawbone_monthly_runtime_format, num);
                            } else {
                                strM3161c2 = null;
                            }
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            i11 = 1;
                            break;
                        case 5:
                            Integer num2 = c10619j.f31510h;
                            if (num2 != null) {
                                int iIntValue = num2.intValue();
                                if (num != null) {
                                    try {
                                        String str2 = AbstractC10620k.f31515e.format(new C5554x(2000, iIntValue, num.intValue()).f18006Y);
                                        AbstractC16544l.m18093f(str2, "format(...)");
                                        strM3161c2 = stringResolver.m3161c(R.string.jawbone_annually_runtime_format, str2);
                                    } catch (DateTimeException e10) {
                                        AbstractC8160o6.m8727b(logger, "Failed to format yearly schedule", e10, 4);
                                        strM3161c2 = null;
                                    }
                                } else {
                                    strM3161c2 = null;
                                }
                            } else {
                                strM3161c2 = null;
                            }
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            i11 = 1;
                            break;
                        case 6:
                            if (list.isEmpty()) {
                                strM3161c2 = stringResolver.m3160b(R.string.jawbone_monthly_custom_schedule_description);
                            } else {
                                C5551u c5551u3 = (C5551u) AbstractC17680n.m19343S(list);
                                if (c5551u3 != null) {
                                    strM3161c2 = stringResolver.m3161c(R.string.jawbone_monthly_custom_schedule_next_run_format, AbstractC10620k.m10985a(c5551u3));
                                }
                            }
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            i11 = 1;
                        case 7:
                            c17247h = setOnEach;
                            linkedHashMap = linkedHashMap2;
                            i11 = 1;
                            strM3161c2 = null;
                            break;
                        default:
                            throw new C0644w();
                    }
                } else {
                    C5524E c5524e2 = C5525F.Companion;
                    c5524e2.getClass();
                    C5525F c5525fM5924a = C5524E.m5924a();
                    C5554x c5554xM5923a3 = AbstractC8519M3.m9187a(c5551u, c5525fM5924a).m5923a();
                    int i19 = AbstractC10620k.f31511a;
                    C5551u c5551uM5929a2 = clock.m5929a();
                    c5524e2.getClass();
                    C5554x c5554xM5923a4 = AbstractC8519M3.m9187a(c5551uM5929a2, C5524E.m5924a()).m5923a();
                    int i20 = AbstractC5555y.f18009c;
                    long jUntil2 = c5554xM5923a3.f18006Y.until(c5554xM5923a4.f18006Y, ChronoUnit.DAYS);
                    int i21 = jUntil2 > 2147483647L ? Integer.MAX_VALUE : jUntil2 < -2147483648L ? Integer.MIN_VALUE : (int) jUntil2;
                    if (i21 == 0) {
                        enumC16392j = EnumC16392j.f50902Y;
                    } else if (i21 == i13) {
                        enumC16392j = EnumC16392j.f50903Z;
                    } else {
                        enumC16392j = (2 > i21 || i21 >= 8) ? EnumC16392j.f50905p0 : EnumC16392j.f50904o0;
                    }
                    int iOrdinal3 = enumC16392j.ordinal();
                    if (iOrdinal3 == 0) {
                        strM3160b = stringResolver.m3160b(R.string.jawbone_last_run_today);
                    } else if (iOrdinal3 == i13) {
                        strM3160b = stringResolver.m3160b(R.string.jawbone_last_run_yesterday);
                    } else if (iOrdinal3 == 2) {
                        strM3160b = AbstractC10620k.m10990f(c5551u, defaultLocale, null);
                    } else {
                        if (iOrdinal3 != 3) {
                            throw new C0644w();
                        }
                        strM3160b = AbstractC10620k.m10987c(AbstractC8519M3.m9187a(c5551u, c5525fM5924a));
                    }
                    strM3161c2 = strM3160b;
                    c17247h = setOnEach;
                    linkedHashMap = linkedHashMap2;
                    it = it2;
                    i11 = i13;
                }
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                linkedHashMap3.put(key, new C21921H1(new C17248i(str, strM3161c2, c16931o.f54373e)));
                it2 = it;
                i13 = i11;
                setOnEach = c17247h;
                linkedHashMap2 = linkedHashMap3;
            }
            return C17247h.m18969e(setOnEach, linkedHashMap2, null, false, 14);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JawboneToolViewModelImpl(C16390h c16390h, Locale locale, C1991h c1991h, C5531a c5531a, Application application, C13969n2 c13969n2, InterfaceC20904w interfaceC20904w) {
        String str = (String) c13969n2.m15477a(C13970o.f44028d);
        C17690x c17690x = C17690x.f56481Y;
        super(new C17247h(c17690x, c17690x, str, false));
        this.f38435i = c16390h;
        this.f38436j = locale;
        this.f38437k = c1991h;
        this.f38438l = c5531a;
        this.f38439m = application;
        this.f38440n = c13969n2;
        this.f38441o = interfaceC20904w;
        this.f38442p = AbstractC8168p6.m8749b("JawboneToolViewModel", null);
        m14396l(new C123861(), c16390h.f50901c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14293n(JawboneToolViewModelImpl jawboneToolViewModelImpl, String str, boolean z6, AbstractC19687c abstractC19687c) {
        JawboneToolViewModelImpl$enableJawbone$1 jawboneToolViewModelImpl$enableJawbone$1;
        jawboneToolViewModelImpl.getClass();
        if (abstractC19687c instanceof JawboneToolViewModelImpl$enableJawbone$1) {
            jawboneToolViewModelImpl$enableJawbone$1 = (JawboneToolViewModelImpl$enableJawbone$1) abstractC19687c;
            int i10 = jawboneToolViewModelImpl$enableJawbone$1.f38448q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jawboneToolViewModelImpl$enableJawbone$1.f38448q0 = i10 - Integer.MIN_VALUE;
            } else {
                jawboneToolViewModelImpl$enableJawbone$1 = new JawboneToolViewModelImpl$enableJawbone$1(jawboneToolViewModelImpl, abstractC19687c);
            }
        } else {
            jawboneToolViewModelImpl$enableJawbone$1 = new JawboneToolViewModelImpl$enableJawbone$1(jawboneToolViewModelImpl, abstractC19687c);
        }
        Object objM17971a = jawboneToolViewModelImpl$enableJawbone$1.f38446o0;
        Object obj = EnumC19250a.f61036Y;
        int i11 = jawboneToolViewModelImpl$enableJawbone$1.f38448q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM17971a);
            jawboneToolViewModelImpl.f38441o.mo21447a(C20869O.f66434c, AbstractC0168G.m535x("enabled", String.valueOf(z6)));
            jawboneToolViewModelImpl.m14397m(new JawboneToolViewModelImpl$enableJawbone$2(str));
            jawboneToolViewModelImpl$enableJawbone$1.f38444Y = jawboneToolViewModelImpl;
            jawboneToolViewModelImpl$enableJawbone$1.f38445Z = str;
            jawboneToolViewModelImpl$enableJawbone$1.f38448q0 = 1;
            objM17971a = jawboneToolViewModelImpl.f38435i.m17971a(str, z6, jawboneToolViewModelImpl$enableJawbone$1);
            if (objM17971a != obj) {
            }
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = jawboneToolViewModelImpl$enableJawbone$1.f38445Z;
        jawboneToolViewModelImpl = jawboneToolViewModelImpl$enableJawbone$1.f38444Y;
        AbstractC9233X.m9807c(objM17971a);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM17971a;
        boolean z10 = abstractC21955Q1 instanceof C21952P1;
        obj = C17296C.f55119a;
        if (z10) {
            jawboneToolViewModelImpl.m14397m(new JawboneToolViewModelImpl$enableJawbone$3$1(new C17309l(new C16934r(str), new C21921H1(obj))));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(jawboneToolViewModelImpl.f38442p, "Failed to change jawbone status", abstractC21933K1.f69485a, 4);
            jawboneToolViewModelImpl.m14397m(new JawboneToolViewModelImpl$enableJawbone$4$1(new C17309l(new C16934r(str), new C21913F1(abstractC21933K1))));
            jawboneToolViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            jawboneToolViewModelImpl.m14397m(new JawboneToolViewModelImpl$enableJawbone$5$1(str));
        }
        return obj;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC17246g intent = (InterfaceC17246g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C17244e) {
            m14394i(new JawboneToolViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C17243d) {
            m14394i(new JawboneToolViewModelImpl$onIntent$2(this, intent, null));
        } else if (intent instanceof C17245f) {
            m14394i(new JawboneToolViewModelImpl$onIntent$3(this, intent, null));
        } else if (intent.equals(C17242c.f55020a)) {
            m14397m(JawboneToolViewModelImpl$onIntent$4.f38466Y);
        }
    }
}
