package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.ZonedDateTime;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.zone.AbstractC15649i;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.v */
/* JADX INFO: loaded from: classes4.dex */
final class C15602v extends C15601u {

    /* JADX INFO: renamed from: i */
    private static final ConcurrentHashMap f48709i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private final TextStyle f48710e;

    /* JADX INFO: renamed from: f */
    private final boolean f48711f;

    /* JADX INFO: renamed from: g */
    private final HashMap f48712g;

    /* JADX INFO: renamed from: h */
    private final HashMap f48713h;

    C15602v(TextStyle textStyle, boolean z6) {
        super(AbstractC15632l.m17165k(), "ZoneText(" + textStyle + Separators.RPAREN);
        this.f48712g = new HashMap();
        this.f48713h = new HashMap();
        this.f48710e = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
        this.f48711f = z6;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p817j$.time.format.C15601u, p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        boolean zM17209g;
        String[] strArr;
        ZoneId zoneId = (ZoneId) c15605y.m17106f(AbstractC15632l.m17166l());
        if (zoneId == null) {
            return false;
        }
        String id2 = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessorM17104d = c15605y.m17104d();
            if (this.f48711f) {
                zM17209g = 2;
            } else if (temporalAccessorM17104d.mo16770f(EnumC15621a.INSTANT_SECONDS)) {
                zM17209g = zoneId.getRules().m17209g(Instant.m16781Q(temporalAccessorM17104d));
            } else {
                EnumC15621a enumC15621a = EnumC15621a.EPOCH_DAY;
                if (temporalAccessorM17104d.mo16770f(enumC15621a)) {
                    EnumC15621a enumC15621a2 = EnumC15621a.NANO_OF_DAY;
                    if (temporalAccessorM17104d.mo16770f(enumC15621a2)) {
                        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(temporalAccessorM17104d.mo16773u(enumC15621a));
                        LocalTime localTimeM16850W = LocalTime.m16850W(temporalAccessorM17104d.mo16773u(enumC15621a2));
                        localDateOfEpochDay.getClass();
                        LocalDateTime localDateTimeM16830of = LocalDateTime.m16830of(localDateOfEpochDay, localTimeM16850W);
                        if (zoneId.getRules().m17207e(localDateTimeM16830of) == null) {
                            ZoneRules rules = zoneId.getRules();
                            ZonedDateTime zonedDateTimeMo16845n = localDateTimeM16830of.mo16845n(zoneId);
                            zonedDateTimeMo16845n.getClass();
                            zM17209g = rules.m17209g(Instant.ofEpochSecond(zonedDateTimeMo16845n.mo16895O(), zonedDateTimeMo16845n.mo16901b().m16855T()));
                        } else {
                            zM17209g = 2;
                        }
                    } else {
                        zM17209g = 2;
                    }
                } else {
                    zM17209g = 2;
                }
            }
            Locale localeM17103c = c15605y.m17103c();
            TextStyle textStyle = TextStyle.NARROW;
            String str = null;
            Map concurrentHashMap = null;
            TextStyle textStyle2 = this.f48710e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = f48709i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(id2);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(localeM17103c)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id2);
                    String[] strArr2 = {id2, timeZone.getDisplayName(false, 1, localeM17103c), timeZone.getDisplayName(false, 0, localeM17103c), timeZone.getDisplayName(true, 1, localeM17103c), timeZone.getDisplayName(true, 0, localeM17103c), id2, id2};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(localeM17103c, strArr2);
                    concurrentHashMap2.put(id2, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zM17209g == 0) {
                    str = strArr[textStyle2.m17052m() + 1];
                } else if (zM17209g == 1) {
                    str = strArr[textStyle2.m17052m() + 3];
                } else {
                    str = strArr[textStyle2.m17052m() + 5];
                }
            }
            if (str != null) {
                id2 = str;
            }
        }
        sb2.append(id2);
        return true;
    }

    @Override // p817j$.time.format.C15601u
    /* JADX INFO: renamed from: a */
    protected final C15595o mo17080a(C15603w c15603w) {
        C15595o c15595oM17074f;
        TextStyle textStyle = TextStyle.NARROW;
        TextStyle textStyle2 = this.f48710e;
        if (textStyle2 == textStyle) {
            return super.mo17080a(c15603w);
        }
        Locale localeM17089i = c15603w.m17089i();
        boolean zM17091k = c15603w.m17091k();
        Set setM17227a = AbstractC15649i.m17227a();
        int size = setM17227a.size();
        HashMap map = zM17091k ? this.f48712g : this.f48713h;
        Map.Entry entry = (Map.Entry) map.get(localeM17089i);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (c15595oM17074f = (C15595o) ((SoftReference) entry.getValue()).get()) == null) {
            c15595oM17074f = C15595o.m17074f(c15603w);
            String[][] zoneStrings = DateFormatSymbols.getInstance(localeM17089i).getZoneStrings();
            int length = zoneStrings.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i10];
                String str = strArr[0];
                if (setM17227a.contains(str)) {
                    c15595oM17074f.m17076a(str, str);
                    String strM17051a = AbstractC15580G.m17051a(str, localeM17089i);
                    for (int i11 = textStyle2 != TextStyle.FULL ? 2 : 1; i11 < strArr.length; i11 += 2) {
                        c15595oM17074f.m17076a(strArr[i11], strM17051a);
                    }
                }
                i10++;
            }
            map.put(localeM17089i, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c15595oM17074f)));
        }
        return c15595oM17074f;
    }
}
