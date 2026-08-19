package p817j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.zone.C15646f;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Map f48532a;
    private static final long serialVersionUID = 8352817235686L;

    /* JADX INFO: renamed from: T */
    abstract void mo16882T(ObjectOutput objectOutput);

    public abstract String getId();

    public abstract ZoneRules getRules();

    static {
        Map.Entry[] entryArr = {AbstractC15529a.m16746j("ACT", "Australia/Darwin"), AbstractC15529a.m16746j("AET", "Australia/Sydney"), AbstractC15529a.m16746j("AGT", "America/Argentina/Buenos_Aires"), AbstractC15529a.m16746j("ART", "Africa/Cairo"), AbstractC15529a.m16746j("AST", "America/Anchorage"), AbstractC15529a.m16746j("BET", "America/Sao_Paulo"), AbstractC15529a.m16746j("BST", "Asia/Dhaka"), AbstractC15529a.m16746j("CAT", "Africa/Harare"), AbstractC15529a.m16746j("CNT", "America/St_Johns"), AbstractC15529a.m16746j("CST", "America/Chicago"), AbstractC15529a.m16746j("CTT", "Asia/Shanghai"), AbstractC15529a.m16746j("EAT", "Africa/Addis_Ababa"), AbstractC15529a.m16746j("ECT", "Europe/Paris"), AbstractC15529a.m16746j("IET", "America/Indiana/Indianapolis"), AbstractC15529a.m16746j("IST", "Asia/Kolkata"), AbstractC15529a.m16746j("JST", "Asia/Tokyo"), AbstractC15529a.m16746j("MIT", "Pacific/Apia"), AbstractC15529a.m16746j("NET", "Asia/Yerevan"), AbstractC15529a.m16746j("NST", "Pacific/Auckland"), AbstractC15529a.m16746j("PLT", "Asia/Karachi"), AbstractC15529a.m16746j("PNT", "America/Phoenix"), AbstractC15529a.m16746j("PRT", "America/Puerto_Rico"), AbstractC15529a.m16746j("PST", "America/Los_Angeles"), AbstractC15529a.m16746j("SST", "Pacific/Guadalcanal"), AbstractC15529a.m16746j("VST", "Asia/Ho_Chi_Minh"), AbstractC15529a.m16746j("EST", "-05:00"), AbstractC15529a.m16746j("MST", "-07:00"), AbstractC15529a.m16746j("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f48532a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Objects.requireNonNull(id2, "zoneId");
        Map map = f48532a;
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id2);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id2, "defaultObj");
        }
        return m16881of((String) objRequireNonNull);
    }

    /* JADX INFO: renamed from: of */
    public static ZoneId m16881of(String str) {
        return m16878Q(str, true);
    }

    /* JADX INFO: renamed from: R */
    public static ZoneId m16879R(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.getId());
        }
        return new C15620t(str, ZoneRules.m17204h(zoneOffset));
    }

    /* JADX INFO: renamed from: Q */
    static ZoneId m16878Q(String str, boolean z6) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m16883V(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return m16880S(str, 3, z6);
        }
        if (str.startsWith("UT")) {
            return m16880S(str, 2, z6);
        }
        return C15620t.m17134U(str, z6);
    }

    /* JADX INFO: renamed from: S */
    private static ZoneId m16880S(String str, int i10, boolean z6) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return m16879R(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return C15620t.m17134U(str, z6);
        }
        try {
            ZoneOffset zoneOffsetM16883V = ZoneOffset.m16883V(str.substring(i10));
            if (zoneOffsetM16883V == ZoneOffset.UTC) {
                return m16879R(strSubstring, zoneOffsetM16883V);
            }
            return m16879R(strSubstring, zoneOffsetM16883V);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    /* JADX INFO: renamed from: P */
    public static ZoneId m16877P(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.mo16774y(AbstractC15632l.m17165k());
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C15620t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.EPOCH);
            }
        } catch (C15646f unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new C15615o((byte) 7, this);
    }
}
