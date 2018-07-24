import Text.Printf

roundToStr :: Int -> String
roundToStr n = let piapx = 16 * atan( 1 / 5 ) - 4 * atan( 1 / 239)
  in printf (printf "%%0.%df" n) piapx

getNDigitPi :: Int -> String
getNDigitPi n =
  if n > 100
	 then roundToStr 100
	 else roundToStr n

handleLine :: String -> Maybe String
handleLine n =
  if length n == 0
     then Nothing
     else let number = read n :: Int
  in Just (getNDigitPi number)

main = do
  n <- getLine
  case handleLine n of
    (Just x) -> print x >> main
    Nothing -> return()
