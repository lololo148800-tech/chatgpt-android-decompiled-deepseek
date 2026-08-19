package p199Hl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p273Kl.C4727J0;
import p344Nl.AbstractC5821C;

/* JADX INFO: renamed from: Hl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3489n extends AbstractC3469E {

    /* JADX INFO: renamed from: c */
    public final Object f10573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3489n(C4727J0 room, List speakers) {
        super(room);
        AbstractC16544l.m18094g(room, "room");
        AbstractC16544l.m18094g(speakers, "speakers");
        this.f10573c = speakers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3489n(C4727J0 room, AbstractC5821C participant, LinkedHashMap linkedHashMap, Map oldAttributes) {
        super(room);
        AbstractC16544l.m18094g(room, "room");
        AbstractC16544l.m18094g(participant, "participant");
        AbstractC16544l.m18094g(oldAttributes, "oldAttributes");
        this.f10573c = oldAttributes;
    }
}
