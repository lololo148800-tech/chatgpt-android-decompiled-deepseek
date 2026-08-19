package p817j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: renamed from: j$.time.zone.h */
/* JADX INFO: loaded from: classes4.dex */
final class C15648h extends AbstractC15649i {

    /* JADX INFO: renamed from: d */
    private final Set f48835d;

    C15648h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f48835d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // p817j$.time.zone.AbstractC15649i
    /* JADX INFO: renamed from: d */
    protected final Set mo17226d() {
        return this.f48835d;
    }

    @Override // p817j$.time.zone.AbstractC15649i
    /* JADX INFO: renamed from: c */
    protected final ZoneRules mo17225c(String str) {
        if (this.f48835d.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new C15646f("Not a built-in time zone: " + str);
    }
}
