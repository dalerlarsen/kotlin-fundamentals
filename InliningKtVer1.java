package rsk;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rsk.InliningKt.main.i.1;

@Metadata(
   mv = {1, 1, 9},
   bv = {1, 0, 2},
   k = 2,
   d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\r¨\u0006\u000e"},
   d2 = {"first", "T", "items", "", "predicate", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "main", "", "args", "", "", "([Ljava/lang/String;)V", "mod-14-higher-order-functions"}
)
public final class InliningKt {
   public static final void main(@NotNull String[] args) {
      Intrinsics.checkParameterIsNotNull(args, "args");
      List ints = CollectionsKt.listOf(new Integer[]{1, 2, 3, 4, 5});
      int i = ((Number)first(ints, (Function1)1.INSTANCE)).intValue();
      System.out.println(i);
   }

   public static final Object first(@NotNull List items, @NotNull Function1 predicate) {
      Intrinsics.checkParameterIsNotNull(items, "items");
      Intrinsics.checkParameterIsNotNull(predicate, "predicate");
      Iterator var3 = items.iterator();

      Object item;
      do {
         if (!var3.hasNext()) {
            throw (Throwable)(new Exception());
         }

         item = var3.next();
      } while(!(Boolean)predicate.invoke(item));

      return item;
   }
}
