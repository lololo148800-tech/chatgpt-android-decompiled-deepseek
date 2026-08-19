package p817j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import p817j$.time.zone.AbstractC15649i;
import p817j$.time.zone.C15646f;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.t */
/* JADX INFO: loaded from: classes4.dex */
final class C15620t extends ZoneId {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f48751d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b */
    private final String f48752b;

    /* JADX INFO: renamed from: c */
    private final transient ZoneRules f48753c;

    /* JADX INFO: renamed from: U */
    static C15620t m17134U(String str, boolean z6) {
        ZoneRules zoneRulesM17228b;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                zoneRulesM17228b = AbstractC15649i.m17228b(str, true);
            } catch (C15646f e10) {
                if (z6) {
                    throw e10;
                }
                zoneRulesM17228b = null;
            }
            return new C15620t(str, zoneRulesM17228b);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    C15620t(String str, ZoneRules zoneRules) {
        this.f48752b = str;
        this.f48753c = zoneRules;
    }

    @Override // p817j$.time.ZoneId
    public final String getId() {
        return this.f48752b;
    }

    @Override // p817j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f48753c;
        return zoneRules != null ? zoneRules : AbstractC15649i.m17228b(this.f48752b, false);
    }

    private Object writeReplace() {
        return new C15615o((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p817j$.time.ZoneId
    /* JADX INFO: renamed from: T */
    final void mo16882T(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f48752b);
    }

    /* JADX INFO: renamed from: V */
    final void m17135V(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f48752b);
    }
}
